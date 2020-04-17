public class Task6 {

    public static int pascal(int i, int j) {
        return (j == 0 || j == i) ? 1 : pascal(i - 1, j - 1) + pascal(i - 1, j);
    }

    public static void main(String[] argc) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }
}
