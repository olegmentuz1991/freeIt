package Task33;

import java.io.FileInputStream;
import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("D:/Work/freeIt/freeIt/lesson11/src/File.txt");
        byte[] byteArray = new byte[stream.available()];
        int count = 0;
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte) stream.read();
            if ((char) byteArray[i] == 44 || (char) byteArray[i] == 58 || (char) byteArray[i] == 59 || (char) byteArray[i] == 45 || (char) byteArray[i] == 40 || (char) byteArray[i] == 41 || (char) byteArray[i] == 63 || (char) byteArray[i] == 33) {
                count++;
            }
            System.out.print((char) byteArray[i]);
        }
        System.out.println();
        System.out.println("Количество знаков препинания = " + count);
        stream.close();
    }

}

