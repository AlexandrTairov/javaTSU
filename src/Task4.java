import java.util.Arrays;

public class Task4 {

    public static void main(String []argc) {
        int k = 100, count = 0;
        int[] array = new int[100];
        for(int i = 0; i < array.length; i ++) {
            array[i] = (int) (Math.random()* ++k);
        }
        for(int ar : array) {
            System.out.println(ar);
            if(ar % 3 == 0) {
                count ++;
            }
        }
        System.out.println("Отсортированный массив:");
        Arrays.sort(array);
        for(int ar : array) {
            System.out.println(ar);
            }
        System.out.println("Количество элементов, кратных 3 = " + count);

    }
}
