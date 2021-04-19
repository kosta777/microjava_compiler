// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public class FactorEnum extends Factor {

    private DesignatorIdentDot DesignatorIdentDot;

    public FactorEnum (DesignatorIdentDot DesignatorIdentDot) {
        this.DesignatorIdentDot=DesignatorIdentDot;
        if(DesignatorIdentDot!=null) DesignatorIdentDot.setParent(this);
    }

    public DesignatorIdentDot getDesignatorIdentDot() {
        return DesignatorIdentDot;
    }

    public void setDesignatorIdentDot(DesignatorIdentDot DesignatorIdentDot) {
        this.DesignatorIdentDot=DesignatorIdentDot;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorIdentDot!=null) DesignatorIdentDot.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorIdentDot!=null) DesignatorIdentDot.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorIdentDot!=null) DesignatorIdentDot.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorEnum(\n");

        if(DesignatorIdentDot!=null)
            buffer.append(DesignatorIdentDot.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorEnum]");
        return buffer.toString();
    }
}
