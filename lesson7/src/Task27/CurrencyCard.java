package Task27;

public class CurrencyCard extends BankCard {
    public String currency;

    public CurrencyCard(String owner, Long uniqueNumber, String paySystem, String currency) {
        super(owner, uniqueNumber, paySystem);
        this.currency = currency;
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
