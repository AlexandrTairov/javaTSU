import java.util.Scanner;

public class Task3 {

    public static void main(String []argc) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a:");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();
        System.out.println("Enter c:");
        c = scanner.nextInt();
        System.out.println("Average = " + average(a, b, c));
        System.out.println("Max = " + max(a, b, c));
    }

    private static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if(b > c) {
            return b;
        } else return c;
    }

    private static int average(int a, int b, int c) {
        return (a+b+c)/3;
    }

}
