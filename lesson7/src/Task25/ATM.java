package Task25;

public class ATM {
    final private int CASH_VALUE100 = 100;
    final private int CASH_VALUE50 = 50;
    final private int CASH_VALUE20 = 20;
    private int cash100;
    private int cash50;
    private int cash20;

    public ATM(int cash100, int cash50, int cash20) {
        this.cash100 = cash100;
        this.cash50 = cash50;
        this.cash20 = cash20;
    }

    public void addCash(int addCash100, int addCash50, int addCash20) {
        this.cash20 = this.cash20 + addCash20;
        this.cash50 = this.cash50 + addCash50;
        this.cash100 = this.cash100 + addCash100;
    }


    public boolean takeCash(int sum) {
        int counter;
        if ((sum % 10 == 0) && (sum < this.cash20 * CASH_VALUE20 + this.cash50 * CASH_VALUE50 + this.cash100 * CASH_VALUE100)) {
            if (sum >= 100) {
                counter = sum / 100;
                this.cash100 = this.cash100 - counter;
                sum = sum % 100;
                System.out.println("Выдано 100 - " + counter);
                if (sum >= 50 && sum % 50 >= 20) {
                    counter = sum / 50;
                    this.cash50 = this.cash50 - counter;
                    sum = sum % 50;
                    System.out.println("Выдано 50 - " + counter);
                }
                if (sum >= 20) {
                    counter = sum / 20;
                    this.cash20 = this.cash20 - counter;
                    System.out.println("Выдано 20 - " + counter);
                }
                if (sum == 0) {
                    return true;
                }

            } else if (sum >= 50) {
                counter = sum / 50;
                sum = sum % 50;
                this.cash50 = this.cash50 - counter;
                System.out.println("Выдано 50 - " + counter);
                if (sum >= 20) {
                    counter = sum / 20;
                    sum = sum % 20;
                    this.cash20 = this.cash20 - counter;
                    System.out.println("Выдано 20 - " + counter);
                }
                if (sum == 0) {
                    return true;
                }
            } else {
                counter = sum / 20;
                sum = sum % 20;
                this.cash20 = this.cash20 - counter;
                System.out.println("Выдано 20 - " + counter);
                if (sum == 0) {
                    return true;
                }
            }
            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "cash100=" + cash100 +
                ", cash50=" + cash50 +
                ", cash20=" + cash20 +
                '}';
    }
}
