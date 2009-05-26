package net.loveruby.cflat.asm;

abstract public class Operand implements OperandPattern {
    abstract public String toSource(SymbolTable table);

    public boolean isRegister() {
        return false;
    }

    public boolean isMemoryReference() {
        return false;
    }

    public IntegerLiteral integerLiteral() {
        return null;
    }

    abstract public void collectStatistics(AsmStatistics stats);

    // default implementation
    public boolean match(Operand operand) {
        return equals(operand);
    }

    public void fixStackOffset(long diff) {
        // does nothing by default
    }
}