package rs.ac.bg.etf.pp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import java_cup.runtime.Symbol;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import rs.ac.bg.etf.pp1.ast.Program;
import rs.ac.bg.etf.pp1.util.Log4JUtils;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;

public class Compiler 
{
	private static Yylex lexer;
	private static MJParser parser;
	private static SemanticAnalyzer semanticAnaylizer;
	private static KostaDumpTableVisitor tableVisitor = new KostaDumpTableVisitor();
	
	static 
	{
		DOMConfigurator.configure(Log4JUtils.instance().findLoggerConfigFile());
		Log4JUtils.instance().prepareLogFile(Logger.getRootLogger());
	}

	public static void tsdump()
	{
		Tab.dump(tableVisitor);
	}
	
	public static void main(String[] args) throws Exception 
	{
		Logger log = Logger.getLogger(Compiler.class);
		
		Reader br = null;
		try
		{
			File sourceCode = new File(args[0]);
			log.info("Compiling source file: " + sourceCode.getAbsolutePath());
			
			br = new BufferedReader(new FileReader(sourceCode));
			lexer = new Yylex(br);
			parser = new MJParser(lexer);
	        Symbol s = parser.parse();
	        
	        if(!(s.value instanceof Program))
	        {
	        	log.error("=========================GRESKA PRI PARSIRANJU============================");
	        	return;
	        }
	        Program prog = (Program)(s.value); 
			// ispis sintaksnog stabla
			//log.info(prog.toString(""));
			//log.info("===================================");

			semanticAnaylizer = new SemanticAnalyzer();
			log.info("=========================SEMANTICKA OBRADA============================");
			prog.traverseBottomUp(semanticAnaylizer); 
			
			if(!semanticAnaylizer.hasErrors())
			{
				File objFile = new File("test/program.obj");
				if(objFile.exists()) objFile.delete();
				
				CodeGenerator codeGenerator = new CodeGenerator();
				prog.traverseBottomUp(codeGenerator);
				Code.dataSize = semanticAnaylizer.nVars + semanticAnaylizer.nArrays + semanticAnaylizer.nVars + semanticAnaylizer.nLocalsInMain;
				Code.mainPc = codeGenerator.getMainPc();
				Code.write(new FileOutputStream(objFile));
				
				log.info("=========================SINTAKSNA ANALIZA============================");
				log.info("Global variables:    "+semanticAnaylizer.nVars);
				log.info("Global constants:    "+semanticAnaylizer.nConstants);
				log.info("Global arrays:    "+semanticAnaylizer.nArrays);
				log.info("Locals in main:    "+semanticAnaylizer.nLocalsInMain);
				log.info("Statements in main:    "+semanticAnaylizer.nStatementsInMain);
				
				tsdump();
			}
			else
			{
				log.error("=========================GRESKA PRI PARSIRANJU============================");
			}
	      
		} 
		finally {
			if (br != null) try { br.close(); } catch (IOException e1) { log.error(e1.getMessage(), e1); }
		}
	}
	
}