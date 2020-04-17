import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] argc) throws IOException {
        task1();
        task2();
//        task3();
//        task4();
//        task5();
//        task6();
    }

    private static void task6() {
        System.out.println("!----------------TASK 6-----------------!");
    }

    private static void task5() {
        System.out.println("!----------------TASK 5-----------------!");
    }

    private static void task4() {
        System.out.println("!----------------TASK 4-----------------!");
    }

    private static void task3() {
        System.out.println("!----------------TASK 3-----------------!");
    }

    private static void task2() {
        System.out.println("!----------------TASK 2-----------------!");
        String filename = "myFile2" + UUID.randomUUID().toString() + ".txt";
        Path target = Paths.get("C:/Users/sanek/Desktop/Учёба/3 курс/6 семестр/Джава1/Лабораторная 12/2/" + filename);
        int[] numbers = new int[10];

        try {
            Files.createFile(target);
            FileWriter writer = new FileWriter(String.valueOf(target), false);
            for(int i = 0; i < 10; i ++) {
                try {
                    int number = (int) (Math.random() * 10);
                    writer.write(Integer.toString(number));
                    writer.append('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.flush();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        try {
            BufferedReader b =
                    new BufferedReader(new FileReader(String.valueOf(Paths.get(String.valueOf(target)))));
            String s = null;
            int i = 0;
            while((s = b.readLine()) != null) {
                numbers[i] = Integer.parseInt(s);
                i ++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Average: " + IntStream.of(numbers).average());
    }

    private static void task1() throws IOException {
        System.out.println("!----------------TASK 1-----------------!");
        Path path = Paths.get("C:/Users/sanek/Desktop/Учёба/3 курс/6 семестр/Джава1/Лабораторная 12/");
        String filename = "myFile" + UUID.randomUUID().toString() + ".java";
        Path target = Paths.get(path +"/1/scr/" + filename);
//        System.out.println(path + "src/Main.java");

        try {
            BufferedReader b =
                    new BufferedReader(new FileReader(String.valueOf(Paths.get(path + "/src/Main.java"))));
            String s = null;
            Files.createFile(target);
            FileWriter writer = new FileWriter(String.valueOf(target), false);
            while((s = b.readLine()) != null) {
                try {
                    writer.write(s);
                    writer.append('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.flush();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Path: " + path.toUri());
        System.out.println("Filename: " + filename);
    }
}
