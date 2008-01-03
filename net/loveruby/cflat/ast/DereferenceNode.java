package net.loveruby.cflat.ast;
import net.loveruby.cflat.type.*;
import net.loveruby.cflat.asm.*;

public class DereferenceNode extends UnaryOpNode implements LHSNode {
    public DereferenceNode(ExprNode n) {
        super(n);
    }

    public boolean isAssignable() { return true; }

    public Type type() {
        return expr().type().baseType();
    }

    // LHS node requirement
    public boolean isConstantAddress() { return false; }

    // LHS node requirement
    public AsmEntity address() {
        throw new Error("DereferenceNode#address");
    }

    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
