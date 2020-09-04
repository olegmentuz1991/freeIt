package Task27;

public class CreditCard extends BankCard {
    private int overDraft;
    private int creditRate;

    public CreditCard(String owner, Long uniqueNumber, String paySystem, int overDraft, int creditRate) {
        super(owner, uniqueNumber, paySystem);
        this.overDraft = overDraft;
        this.creditRate = creditRate;
    }

    @Override
    protected void cashIn() {
        //реализация
    }

    @Override
    protected void cashOut() {
        //реализация
    }
}
