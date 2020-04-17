import java.util.Scanner;

public class Task1 {

    public static void main(String[] argc) {
        System.out.println("Enter k:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        byte[] a = new byte[k];
        for(int i = 0; i < a.length; i ++) {
            a[i] = (byte) (Math.random()* + 127);
        }
        Byte[] b = new Byte[k];
        System.out.println("byte: ");
        for(int i = 0; i < a.length; i ++) {
            System.out.print(a[i] + " ");
            b[i] = (Byte)a[i];
        }
        System.out.println();
        System.out.println("Byte: ");
        Integer[] c = new Integer[k];
        for(int i = 0; i < a.length; i ++) {
            System.out.print(b[i] + " ");
            c[i] = Integer.valueOf(b[i]);
        }
        int[] d = new int[k];
        String[] e = new String[k];
        System.out.println();
        System.out.println("Integer: ");
        for(int i = 0; i < a.length; i ++) {
            System.out.print(c[i] + " ");
            d[i] = (int)c[i];
            e[i] = Integer.toString(c[i]);
        }
        System.out.println();
        System.out.println("int: ");
        for(int arr: d) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("String: ");
        for(String str: e) {
            System.out.print(str + " ");
        }


    }
}
