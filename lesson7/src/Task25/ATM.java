package Task25;

public class ATM {
    private int cash100;
    private int cash50;
    private int cash20;

    public ATM(int cash100, int cash50, int cash20) {
        this.cash100 = cash100;
        this.cash50 = cash50;
        this.cash20 = cash20;
    }

    public void addCash(int addCash20, int addCash50, int addCash100) {
        this.cash20 = this.cash20 + addCash20;
        this.cash50 = this.cash50 + addCash50;
        this.cash100 = this.cash100 + addCash100;
    }

    public boolean takeCash(int sum, int cash20, int cash50, int cash100){
        if((sum%10==0)&&(sum > cash20 * 20 + cash50 * 50 + cash100 * 100)){
            this.cash20 =this.cash20 -  cash20;
            this.cash50 =this.cash50 -  cash50;
            this.cash100 =this.cash100 -  cash100;
            return true;
        }else return false;

    }
}
