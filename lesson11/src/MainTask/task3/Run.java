package MainTask.task3;

import java.io.*;

import static MainTask.task3.TextFormater.hasPalindromeWord;


public class Run {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("D:/work/freeit/freeit/lesson11/src/palindrome.txt")));
        BufferedReader reader = new BufferedReader(new FileReader(new File("D:/work/freeit/freeit/lesson11/src/sentences.txt")));
        String text = "";
        while (reader.ready()) {
            text = text.concat(reader.readLine());
        }
        String[] sentences = text.split("[.!?]\\s*");
        for (int i =0; i<sentences.length;i++){
            if (hasPalindromeWord(sentences[i])){
                writer.write(sentences[i]+". ");
                writer.flush();
            }
        }


    }

}
