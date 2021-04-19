// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(EnumDecl EnumDecl);
    public void visit(Mulop Mulop);
    public void visit(MethodDecl MethodDecl);
    public void visit(InterfaceDecl InterfaceDecl);
    public void visit(Constant Constant);
    public void visit(TermList TermList);
    public void visit(Var Var);
    public void visit(StatementList StatementList);
    public void visit(Addop Addop);
    public void visit(EnumDeclList EnumDeclList);
    public void visit(Factor Factor);
    public void visit(VarList VarList);
    public void visit(ConstList ConstList);
    public void visit(DeclList DeclList);
    public void visit(Method Method);
    public void visit(Designator Designator);
    public void visit(FormParsList FormParsList);
    public void visit(EnumDeclIntro EnumDeclIntro);
    public void visit(ExprList ExprList);
    public void visit(VarDeclList VarDeclList);
    public void visit(Expr Expr);
    public void visit(MethodTypeName MethodTypeName);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(Statement Statement);
    public void visit(VarDecl VarDecl);
    public void visit(ClassDecl ClassDecl);
    public void visit(ConstDecl ConstDecl);
    public void visit(Declaration Declaration);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(FormParsDecl FormParsDecl);
    public void visit(FormPars FormPars);
    public void visit(MethodDeclNoPars MethodDeclNoPars);
    public void visit(DesignatorIdentArrayStart DesignatorIdentArrayStart);
    public void visit(DesignatorIdentArray DesignatorIdentArray);
    public void visit(DesignatorIdentDot DesignatorIdentDot);
    public void visit(DesignatorIdent DesignatorIdent);
    public void visit(DesignatorBasicArray DesignatorBasicArray);
    public void visit(DesignatorBasic DesignatorBasic);
    public void visit(FactorArrayInit FactorArrayInit);
    public void visit(FactorDesignator FactorDesignator);
    public void visit(FactorEnum FactorEnum);
    public void visit(FactorBoolConst FactorBoolConst);
    public void visit(FactorExprInBrackets FactorExprInBrackets);
    public void visit(FactorCharConst FactorCharConst);
    public void visit(FactorNumConst FactorNumConst);
    public void visit(TermListNone TermListNone);
    public void visit(TermListMulopMod TermListMulopMod);
    public void visit(TermListMulopDiv TermListMulopDiv);
    public void visit(TermListMulopMul TermListMulopMul);
    public void visit(TermNeg TermNeg);
    public void visit(Term Term);
    public void visit(ExprListNone ExprListNone);
    public void visit(ExprListAddopSub ExprListAddopSub);
    public void visit(ExprListAddopAdd ExprListAddopAdd);
    public void visit(ExprMinus ExprMinus);
    public void visit(ExprPlus ExprPlus);
    public void visit(DesignatorArrayInit DesignatorArrayInit);
    public void visit(DesignatorStatementMinusMinus DesignatorStatementMinusMinus);
    public void visit(DesignatorStatementPlusPlus DesignatorStatementPlusPlus);
    public void visit(DesignatorStatementAssign DesignatorStatementAssign);
    public void visit(StatementError StatementError);
    public void visit(StmntPrintNumconst StmntPrintNumconst);
    public void visit(StmntPrint StmntPrint);
    public void visit(StmntRead StmntRead);
    public void visit(StmntDegisnator StmntDegisnator);
    public void visit(StatementSingleList StatementSingleList);
    public void visit(StatementSingle StatementSingle);
    public void visit(Type Type);
    public void visit(FormParsDerived2 FormParsDerived2);
    public void visit(FormParsDerived1 FormParsDerived1);
    public void visit(FormParsDeclDerived2 FormParsDeclDerived2);
    public void visit(FormParsDeclDerived1 FormParsDeclDerived1);
    public void visit(FormParsListDerived1 FormParsListDerived1);
    public void visit(MethodVoidWithName MethodVoidWithName);
    public void visit(MethodTypeWithName MethodTypeWithName);
    public void visit(MethodDeclarationNoPars MethodDeclarationNoPars);
    public void visit(MethodDeclaration MethodDeclaration);
    public void visit(MethodDerived2 MethodDerived2);
    public void visit(MethodDerived1 MethodDerived1);
    public void visit(MethodDeclListDerived2 MethodDeclListDerived2);
    public void visit(MethodDeclListDerived1 MethodDeclListDerived1);
    public void visit(VarDeclListDerived2 VarDeclListDerived2);
    public void visit(VarDeclListDerived1 VarDeclListDerived1);
    public void visit(VarDerived1 VarDerived1);
    public void visit(VariableArray VariableArray);
    public void visit(Variable Variable);
    public void visit(VarListObjSecond VarListObjSecond);
    public void visit(VarListObjFirst VarListObjFirst);
    public void visit(ErrorVarDeclSEMI ErrorVarDeclSEMI);
    public void visit(VarDeclDerived1 VarDeclDerived1);
    public void visit(VarDeclaration VarDeclaration);
    public void visit(EnumDeclarationWithValue EnumDeclarationWithValue);
    public void visit(EnumDeclaration EnumDeclaration);
    public void visit(EnumDeclarationList EnumDeclarationList);
    public void visit(EnumDeclarationListSingle EnumDeclarationListSingle);
    public void visit(EnumName EnumName);
    public void visit(EnumDeclarationIntroduction EnumDeclarationIntroduction);
    public void visit(ConstantBool ConstantBool);
    public void visit(ConstantChar ConstantChar);
    public void visit(ConstantNum ConstantNum);
    public void visit(ConstListDerived2 ConstListDerived2);
    public void visit(ConstListDerived1 ConstListDerived1);
    public void visit(ConstDeclObj ConstDeclObj);
    public void visit(DeclarationEnum DeclarationEnum);
    public void visit(DeclarationVar DeclarationVar);
    public void visit(DeclarationConst DeclarationConst);
    public void visit(NoDeclarations NoDeclarations);
    public void visit(Declarations Declarations);
    public void visit(ProgName ProgName);
    public void visit(Program Program);

}
