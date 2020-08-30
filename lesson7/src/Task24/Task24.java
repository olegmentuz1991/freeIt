package Task24;

public class Task24 {
    public static void main(String[] args) {
        Time time = new Time(40,0,20);
        Time time1 = new Time(720);
        System.out.println(time1.calculateTime().toString());
        System.out.println(time.compareTime(time1));

    }
}
