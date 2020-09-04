package Task27;

public class MasterCard extends BankCard {
    private String loyaltyProgram;
    //typeOfCard - Gold,Platinum,Simple
    private String cardType;
    private double convertEuroRate;

    public MasterCard(String owner, Long uniqueNumber, String paySystem, String loyaltyProgram, String cardType, double convertEuroRate) {
        super(owner, uniqueNumber, paySystem);
        this.loyaltyProgram = loyaltyProgram;
        this.cardType = cardType;
        this.convertEuroRate = convertEuroRate;
    }

    public String getLoyaltyProgram() {
        return loyaltyProgram;
    }

    public void setLoyaltyProgram(String loyaltyProgram) {
        this.loyaltyProgram = loyaltyProgram;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getConvertEuroRate() {
        return convertEuroRate;
    }

    public void setConvertEuroRate(double convertEuroRate) {
        this.convertEuroRate = convertEuroRate;
    }

    @Override
    protected void cashIn() {

    }

    @Override
    protected void cashOut() {

    }
}
