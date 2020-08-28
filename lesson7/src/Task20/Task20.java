package Task20;
//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.
public class Task20 {
    public static void main(String[] args) {
            String str = "Имеется строка с текстом";
            StringBuilder res = new StringBuilder();

            String [] words = str.split("\\s+");
            for ( String word : words )
                res.append(word.toCharArray()[word.length() - 1]);
            System.out.println("Result: " + res.toString());
        }
    }


