// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public class VariableArray extends Var {

    private String varNameArray;

    public VariableArray (String varNameArray) {
        this.varNameArray=varNameArray;
    }

    public String getVarNameArray() {
        return varNameArray;
    }

    public void setVarNameArray(String varNameArray) {
        this.varNameArray=varNameArray;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VariableArray(\n");

        buffer.append(" "+tab+varNameArray);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VariableArray]");
        return buffer.toString();
    }
}
