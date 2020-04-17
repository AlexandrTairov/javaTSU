import java.util.Scanner;

public class Task2 {
    public static void main(String []argc) {
        Integer x1 = 0, x2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        Integer n = scanner.nextInt();
        Integer[] array = new Integer[n];
        array[0] = x1;
        array[1] = x2;
        for(Integer i = 2; i < n ; i ++) {
            array[i] = newElement(array[i-1], array[i-2]);
        }
        System.out.println("Elements:");
        for(Integer ar: array) {
            System.out.println(ar);
        }

    }

    public static int newElement(int a, int b) {
        return a+b;
    }
}
