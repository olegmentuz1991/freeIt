package Task27;

public abstract class BankCard {
    private String owner;
    private Long uniqueNumber;
    private String paySystem;
    private long cashValue;

    public long getCashValue() {
        return cashValue;
    }

    public void setCashValue(long cashValue) {
        this.cashValue = cashValue;
    }
    protected abstract void cashIn();
   protected abstract void cashOut();

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(Long uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getPaySystem() {
        return paySystem;
    }

    public void setPaySystem(String paySystem) {
        this.paySystem = paySystem;
    }

    public BankCard(String owner, Long uniqueNumber, String paySystem) {
        this.owner = owner;
        this.uniqueNumber = uniqueNumber;
        this.paySystem = paySystem;
    }
}
