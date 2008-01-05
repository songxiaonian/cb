package net.loveruby.cflat.ast;
import net.loveruby.cflat.type.*;

public class IntegerLiteralNode extends LiteralNode {
    protected long value;

    public IntegerLiteralNode(Location loc, TypeRef ref, long value) {
        super(loc, ref);
        this.value = value;
    }

    public long value() {
        return value;
    }

    protected void _dump(Dumper d) {
        d.printMember("value", value);
    }

    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
