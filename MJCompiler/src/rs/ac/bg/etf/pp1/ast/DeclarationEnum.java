// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public class DeclarationEnum extends Declaration {

    private EnumDeclIntro EnumDeclIntro;

    public DeclarationEnum (EnumDeclIntro EnumDeclIntro) {
        this.EnumDeclIntro=EnumDeclIntro;
        if(EnumDeclIntro!=null) EnumDeclIntro.setParent(this);
    }

    public EnumDeclIntro getEnumDeclIntro() {
        return EnumDeclIntro;
    }

    public void setEnumDeclIntro(EnumDeclIntro EnumDeclIntro) {
        this.EnumDeclIntro=EnumDeclIntro;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(EnumDeclIntro!=null) EnumDeclIntro.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(EnumDeclIntro!=null) EnumDeclIntro.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(EnumDeclIntro!=null) EnumDeclIntro.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DeclarationEnum(\n");

        if(EnumDeclIntro!=null)
            buffer.append(EnumDeclIntro.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DeclarationEnum]");
        return buffer.toString();
    }
}
