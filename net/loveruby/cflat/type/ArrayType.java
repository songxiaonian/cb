package net.loveruby.cflat.type;

public class ArrayType extends Type {
    protected Type baseType;
    protected long length;

    public ArrayType(Type baseType) {
        this.baseType = baseType;
        length = -1;
    }

    public ArrayType(Type baseType, long length) {
        this.baseType = baseType;
        this.length = length;
    }

    public boolean isArray() { return true; }
    public boolean isDereferable() { return true; }

    public Type baseType() {
        return baseType;
    }

    public long length() {
        return length;
    }

    public long size() {
        // platform dependent: take alignment into account
        return baseType.size() * length;
    }

    public String textize() {
        if (length < 0) {
            return baseType.textize() + "[]";
        }
        else {
            return baseType.textize() + "[" + length + "]";
        }
    }
}
