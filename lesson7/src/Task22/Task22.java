package Task22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {
        String text = "0x0249a7342 345345 d45345 0x3425d";
        Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }


    }
}
