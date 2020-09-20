package MainTask.Task2;


import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("D:/work/freeit/freeit/lesson11/src/palindrome35.txt")));
            BufferedReader reader = new BufferedReader(new FileReader(new File("D:/work/freeit/freeit/lesson11/src/pali.txt")));
            while (reader.ready()) {
                String line = reader.readLine();
                String reverse = "";
                System.out.println(line);
                for ( int i = line.length() - 1; i >= 0; i-- ){
                    reverse = reverse + line.charAt(i);
                }
                System.out.println(reverse);
                if (reverse.equals(line)){
                    writer.write(reverse + " ");
                    writer.flush();
                } else if (line.length()<=5 && line.length()>=3) {
                    writer.write(line +" ");
                    writer.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
