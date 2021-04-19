// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public class DesignatorBasicArray extends Designator {

    private DesignatorIdentArray DesignatorIdentArray;

    public DesignatorBasicArray (DesignatorIdentArray DesignatorIdentArray) {
        this.DesignatorIdentArray=DesignatorIdentArray;
        if(DesignatorIdentArray!=null) DesignatorIdentArray.setParent(this);
    }

    public DesignatorIdentArray getDesignatorIdentArray() {
        return DesignatorIdentArray;
    }

    public void setDesignatorIdentArray(DesignatorIdentArray DesignatorIdentArray) {
        this.DesignatorIdentArray=DesignatorIdentArray;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorIdentArray!=null) DesignatorIdentArray.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorIdentArray!=null) DesignatorIdentArray.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorIdentArray!=null) DesignatorIdentArray.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorBasicArray(\n");

        if(DesignatorIdentArray!=null)
            buffer.append(DesignatorIdentArray.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorBasicArray]");
        return buffer.toString();
    }
}
