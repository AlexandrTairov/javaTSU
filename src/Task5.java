import java.util.Scanner;

public class Task5 {

    public static void main(String []argc) {
        int x1 = 0, x2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        array[0] = x1;
        array[1] = x2;
        for(int i = 2; i < n ; i ++) {
            array[i] = newElement(array[i-1], array[i-2]);
        }
        System.out.println("Elements:");
        for(int ar: array) {
            System.out.println(ar);
        }

    }

    public static int newElement(int a, int b) {
        return a+b;
    }
}
