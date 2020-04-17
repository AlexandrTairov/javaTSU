import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] argc) throws IOException {
        task1();
        String filename = task2();
//        task3();
//        task4(filename);
//        task5();
//        task6();
    }

    private static void task6() {
        System.out.println("!----------------TASK 6-----------------!");
    }

    private static void task5() {
        System.out.println("!----------------TASK 5-----------------!");
    }

    private static void task4(String filename) {
        System.out.println("!----------------TASK 4-----------------!");
        Path target = Paths.get("C:/Users/sanek/Desktop/Учёба/3 курс/6 семестр/Джава1/Лабораторная 12/2/" + filename);
        List<Integer> numbers = new ArrayList<>();
        ListIterator<Integer> it = numbers.listIterator();
        try {
            BufferedReader b =
                    new BufferedReader(new FileReader(String.valueOf(Paths.get(String.valueOf(target)))));
            String s = null;
            int i = 0;
            while((s = b.readLine()) != null) {
                numbers.add(Integer.parseInt(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int middleSize = numbers.size()/2;
        int middle = numbers.get(numbers.size()/2);
        System.out.println("middle: " + middle);

        for(int i: numbers) {
            System.out.println(i);
        }

//        int [] timeArray = new int[middle];
//        it.set(middle);
//        for(int i = 0; i < middleSize; i ++) {
//            System.out.println("!!!!!!!!!!");
//            it.next();
//        }
//
//        for(int i = 0 ; i < timeArray.length; i ++) {
//            //System.out.println(it.next());
//            timeArray[i] = it.next();
//        }

        System.out.println("Count: " + numbers.size());
//        System.out.println("Average 1/2: " + IntStream.of(timeArray).average());

    }

    private static void task3() {
        System.out.println("!----------------TASK 3-----------------!");
        String filename = "myFile3" + UUID.randomUUID().toString() + ".txt";
        Path target = Paths.get("C:/Users/sanek/Desktop/Учёба/3 курс/6 семестр/Джава1/Лабораторная 12/3/" + filename);
        int[] numbers = new int[(int) (Math.random() * 200 + 1)];

        File dir = new File("C:/Users/sanek/Desktop/Учёба/3 курс/6 семестр/Джава1/Лабораторная 12/3/");
        // если объект представляет каталог
        if (dir.isDirectory()) {
            // удаляем все вложенные объекты в каталоге
            for (File item : dir.listFiles()) {
                item.delete();
            }
        }

        try {
            Files.createFile(target);
            FileWriter writer = new FileWriter(String.valueOf(target), false);
            for (int i = 0; i < numbers.length; i++) {
                try {
                    int number = (int) (Math.random() * 50);
                    writer.write(Integer.toString(number));
                    writer.append('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }


    }


    private static String task2() {
        System.out.println("!----------------TASK 2-----------------!");
        String filename = "myFile2" + UUID.randomUUID().toString() + ".txt";
        Path target = Paths.get("C:/Users/sanek/Desktop/Учёба/3 курс/6 семестр/Джава1/Лабораторная 12/2/" + filename);
        int[] numbers = new int[(int) (Math.random() * 30 + 1)];

        File dir = new File("C:/Users/sanek/Desktop/Учёба/3 курс/6 семестр/Джава1/Лабораторная 12/2/");
        // если объект представляет каталог
        if (dir.isDirectory()) {
            // удаляем все вложенные объекты в каталоге
            for (File item : dir.listFiles()) {
                item.delete();
            }
        }

            try {
                Files.createFile(target);
                FileWriter writer = new FileWriter(String.valueOf(target), false);
                for (int i = 0; i < numbers.length; i++) {
                    try {
                        int number = (int) (Math.random() * 50);
                        writer.write(Integer.toString(number));
                        writer.append('\n');
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                writer.flush();
            } catch (FileNotFoundException e) {
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
                while ((s = b.readLine()) != null) {
                    numbers[i] = Integer.parseInt(s);
                    i++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Average: " + IntStream.of(numbers).average());

            return filename;
        }

    private static void task1() throws IOException {
        System.out.println("!----------------TASK 1-----------------!");
        Path path = Paths.get("C:/Users/sanek/Desktop/Учёба/3 курс/6 семестр/Джава1/Лабораторная 12/");
        String filename = "myFile" + UUID.randomUUID().toString() + ".java";
        Path target = Paths.get(path +"/1/scr/" + filename);

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
