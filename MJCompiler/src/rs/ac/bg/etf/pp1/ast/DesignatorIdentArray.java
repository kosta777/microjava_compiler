// generated with ast extension for cup
// version 0.8
// 5/1/2019 22:58:12


package rs.ac.bg.etf.pp1.ast;

public class DesignatorIdentArray implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private DesignatorIdentArrayStart DesignatorIdentArrayStart;
    private Expr Expr;

    public DesignatorIdentArray (DesignatorIdentArrayStart DesignatorIdentArrayStart, Expr Expr) {
        this.DesignatorIdentArrayStart=DesignatorIdentArrayStart;
        if(DesignatorIdentArrayStart!=null) DesignatorIdentArrayStart.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public DesignatorIdentArrayStart getDesignatorIdentArrayStart() {
        return DesignatorIdentArrayStart;
    }

    public void setDesignatorIdentArrayStart(DesignatorIdentArrayStart DesignatorIdentArrayStart) {
        this.DesignatorIdentArrayStart=DesignatorIdentArrayStart;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorIdentArrayStart!=null) DesignatorIdentArrayStart.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorIdentArrayStart!=null) DesignatorIdentArrayStart.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorIdentArrayStart!=null) DesignatorIdentArrayStart.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorIdentArray(\n");

        if(DesignatorIdentArrayStart!=null)
            buffer.append(DesignatorIdentArrayStart.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorIdentArray]");
        return buffer.toString();
    }
}
