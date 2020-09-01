package Task23;


public class Task23 {
    public static void main(String[] args) {
        String text = "<p id=”p1”>";
        String result = text.replaceAll("<p.+>","<p></p>");
        System.out.println(result);
    }

}
