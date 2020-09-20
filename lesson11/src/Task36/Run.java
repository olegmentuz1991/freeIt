package Task36;

import java.io.File;

public class Run {
    public static void main(String[] args) {
        File file = new File("D:/work/freeit/freeit/lesson11/src");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println("Файл - " + file1);
            }
            else {
                System.out.println("Папка - " + file1);
            }
        }
    }
}
