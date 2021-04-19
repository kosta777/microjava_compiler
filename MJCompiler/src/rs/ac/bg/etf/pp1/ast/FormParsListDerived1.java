// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public class FormParsListDerived1 extends FormParsList {

    private FormParsDecl FormParsDecl;

    public FormParsListDerived1 (FormParsDecl FormParsDecl) {
        this.FormParsDecl=FormParsDecl;
        if(FormParsDecl!=null) FormParsDecl.setParent(this);
    }

    public FormParsDecl getFormParsDecl() {
        return FormParsDecl;
    }

    public void setFormParsDecl(FormParsDecl FormParsDecl) {
        this.FormParsDecl=FormParsDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormParsDecl!=null) FormParsDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormParsDecl!=null) FormParsDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormParsDecl!=null) FormParsDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParsListDerived1(\n");

        if(FormParsDecl!=null)
            buffer.append(FormParsDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParsListDerived1]");
        return buffer.toString();
    }
}
