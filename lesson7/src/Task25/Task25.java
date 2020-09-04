package Task25;

public class Task25 {
    public static void main(String[] args) {
        ATM atm = new ATM(30,20,10);
        atm.addCash(1,2,3);
        System.out.println(atm.takeCash(270));
        System.out.println(atm.toString());
    }
}
