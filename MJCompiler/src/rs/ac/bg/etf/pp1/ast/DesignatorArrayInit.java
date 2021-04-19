// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public class DesignatorArrayInit extends DesignatorStatement {

    private Designator Designator;
    private FactorArrayInit FactorArrayInit;

    public DesignatorArrayInit (Designator Designator, FactorArrayInit FactorArrayInit) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.FactorArrayInit=FactorArrayInit;
        if(FactorArrayInit!=null) FactorArrayInit.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public FactorArrayInit getFactorArrayInit() {
        return FactorArrayInit;
    }

    public void setFactorArrayInit(FactorArrayInit FactorArrayInit) {
        this.FactorArrayInit=FactorArrayInit;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(FactorArrayInit!=null) FactorArrayInit.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(FactorArrayInit!=null) FactorArrayInit.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(FactorArrayInit!=null) FactorArrayInit.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorArrayInit(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FactorArrayInit!=null)
            buffer.append(FactorArrayInit.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorArrayInit]");
        return buffer.toString();
    }
}
