

public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;

    ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    @Override
    public boolean equals(Object anObject) {
        return anObject == this;
    }

    @Override
    public int hashCode(){
        return s.hashCode();
    }

    @Override
    public String toString() {
        return b + " " + i + " " + d + " " + s;
    }

}
