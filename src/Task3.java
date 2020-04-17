import java.util.Scanner;

public class Task3 {

    public static Integer pascal(Integer i, Integer j) {
        return (j == 0 || j == i) ? 1 : pascal(i - 1, j - 1) + pascal(i - 1, j);
    }

    public static void main(String[] argc) {
        for (Integer i = 0; i <= 10; i++) {
            for (Integer j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }
}
