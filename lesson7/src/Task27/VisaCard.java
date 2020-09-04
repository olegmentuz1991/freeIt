package Task27;

public class VisaCard extends BankCard {
    private String loyaltyProgram;
    //typeOfCard - Gold,Platinum,Simple
    private String cardType;
    private double convertUSDRate;

    public VisaCard(String owner, Long uniqueNumber, String paySystem, String loyaltyProgram, String cardType, double convertUSDRate) {
        super(owner, uniqueNumber, paySystem);
        this.loyaltyProgram = loyaltyProgram;
        this.cardType = cardType;
        this.convertUSDRate = convertUSDRate;
    }

    public double getConvertUSDRate() {
        return convertUSDRate;
    }

    public void setConvertUSDRate(double convertUSDRate) {
        this.convertUSDRate = convertUSDRate;
    }

    public String getLoyaltyProgram() {
        return loyaltyProgram;
    }

    public void setLoyaltyProgram(String loyalityProgram) {
        this.loyaltyProgram = loyalityProgram;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    protected void cashIn() {

    }

    @Override
    protected void cashOut() {

    }
}
