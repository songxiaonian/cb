package net.loveruby.cflat.type;

public class VoidTypeRef extends TypeRef {
    public VoidTypeRef() {
    }

    public boolean isVoid() {
        return true;
    }

    public boolean equals(Object other) {
        return (other instanceof VoidTypeRef);
    }

    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "void";
    }
}
