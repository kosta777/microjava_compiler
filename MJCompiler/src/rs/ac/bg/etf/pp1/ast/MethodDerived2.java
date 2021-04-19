// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public class MethodDerived2 extends Method {

    private MethodDeclNoPars MethodDeclNoPars;

    public MethodDerived2 (MethodDeclNoPars MethodDeclNoPars) {
        this.MethodDeclNoPars=MethodDeclNoPars;
        if(MethodDeclNoPars!=null) MethodDeclNoPars.setParent(this);
    }

    public MethodDeclNoPars getMethodDeclNoPars() {
        return MethodDeclNoPars;
    }

    public void setMethodDeclNoPars(MethodDeclNoPars MethodDeclNoPars) {
        this.MethodDeclNoPars=MethodDeclNoPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodDeclNoPars!=null) MethodDeclNoPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodDeclNoPars!=null) MethodDeclNoPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodDeclNoPars!=null) MethodDeclNoPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDerived2(\n");

        if(MethodDeclNoPars!=null)
            buffer.append(MethodDeclNoPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDerived2]");
        return buffer.toString();
    }
}
