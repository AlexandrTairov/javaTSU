public class Main {

    public static void main(String[] args) {

        ExtendedClass p = new ExtendedClass((byte) 111, 2, 3.14d, "Hello world!");
        ExtendedClass pp = new ExtendedClass((byte) 11, 22, 3.1d, "world!");
        System.out.println("ExtendedClass equals: " + p.equals(p));
        System.out.println("ExtendedClass equals: " + p.equals(pp));
        System.out.println("ExtendedClass hashcode: " + p.hashCode());
        System.out.println("ExtendedClass toString: " + p.toString());

        PhoneNumber ph1 = new PhoneNumber(800, 555, 3535);
        PhoneNumber ph2 = new PhoneNumber(927, 122, 3618);
        System.out.println("Phone number equals: " + ph1.equals(ph2));
        System.out.println("Phone number equals: " + ph1.equals(ph1));

        Fibonacci f1 = new Fibonacci(3);
        Fibonacci f2 = new Fibonacci(5);
        System.out.println("Fibonacci equals: " + f1.equals(f2));
        System.out.println("Fibonacci equals: " + f1.equals(f1));

        PascalTriangle t1 = new PascalTriangle(4);
        PascalTriangle t2 = new PascalTriangle(7);
        System.out.println("PascalTriangle equals: " + t1.equals(t2));
        System.out.println("PascalTriangle equals: " + t1.equals(t1));

        Complex c1 = new Complex(2, 3.4);
        Complex c2 = new Complex(2.1, 3);
        System.out.println("Complex equals: " + c1.equals(c2));
        System.out.println("Complex equals: " + c1.equals(c1));
    }
}
