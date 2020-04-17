public class Task2 {

    public static void main(String []argc) {
        int a = 0xf;
        int b = 0xa;
        System.out.println("a = " + a + " b = " + b);
        System.out.println("+ " + (a+b));
        System.out.println("- " + (a-b));
        System.out.println("* " + a*b);
        System.out.println("/ " + a/b);
        System.out.println("a++ " + (a++));
        System.out.println("++a " + (++a));
        System.out.println("b++ " + (b++));
        System.out.println("++b " + (++b));
        a = 0xf;
        b = 0xa;
        System.out.println("bin a = " + Integer.toBinaryString(a));
        System.out.println("bin b = " + Integer.toBinaryString(b));
        System.out.println("~a " + Integer.toBinaryString(~a));
        System.out.println("~b " + Integer.toBinaryString(~b));
        System.out.println("a & b " + (a&b));
        System.out.println("a | b " + (a|b));
        System.out.println("a ^ b " + (a^b));
        System.out.println("a >> 2 " + (a>>2));
        System.out.println("a << 2 " + (a<<2));
        System.out.println("b >> 2 " + (b>>2));
        System.out.println("b << 2 " + (b<<2));

    }
}
