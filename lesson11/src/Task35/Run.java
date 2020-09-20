package Task35;
import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException {
        DataOutputStream oStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:/Work/freeIt/freeIt/lesson11/src/File.dat")));
        DataInputStream iStream = new DataInputStream(new BufferedInputStream(new FileInputStream("D:/Work/freeIt/freeIt/lesson11/src/File.dat")));
        int x = 20;
        int digit = 0;
        for (int i = 0; i < x; i++) {
            int number = (int) (Math.random() * 10);
            oStream.writeInt(number);
            System.out.println(number);

        }
        oStream.close();
        for (int i =0; i<x;i++) {
            digit += iStream.readInt();
        }
        System.out.println("Сумма =" + digit);
        System.out.println("Ср. арифметическое = " + digit/x);
    }
}
