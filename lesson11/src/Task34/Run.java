package Task34;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Run {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:/Work/freeIt/freeIt/lesson11/src/File.txt"));
        String tmp = reader.readLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher;
        int sum = 0;
        int count = 0;
        while (reader.ready()) {
            tmp = tmp.concat(reader.readLine()).concat(" ");
        }
            matcher = pattern.matcher(tmp);
            while (matcher.find()){
                sum += Integer.parseInt(matcher.group());
                count++;
                System.out.println(matcher.group());
            }
        System.out.println("Количество чисел = " + count);
        System.out.println("Сумма чисел = " + sum);
    }
}



