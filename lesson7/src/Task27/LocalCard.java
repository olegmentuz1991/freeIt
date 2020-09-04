package Task27;

public class LocalCard extends BankCard {
    private String partnerBank;
    private String ownerBank;
    private String country;

    public LocalCard(String owner, Long uniqueNumber, String paySystem, String partnerBank, String ownerBank) {
        super(owner, uniqueNumber, paySystem);
        this.partnerBank = partnerBank;
        this.ownerBank = ownerBank;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPartnerBank() {
        return partnerBank;
    }

    public void setPartnerBank(String partnerBank) {
        this.partnerBank = partnerBank;
    }

    public String getOwnerBank() {
        return ownerBank;
    }

    public void setOwnerBank(String ownerBank) {
        this.ownerBank = ownerBank;
    }

    @Override
    protected void cashIn() {

    }

    @Override
    protected void cashOut() {

    }
}
