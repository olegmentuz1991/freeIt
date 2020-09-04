package Task27;

public class WorldCard extends BankCard {
    private boolean acquiring;

    public WorldCard(String owner, Long uniqueNumber, String paySystem, boolean acquiring) {
        super(owner, uniqueNumber, paySystem);
        this.acquiring = acquiring;
    }

    @Override
    protected void cashIn() {

    }

    @Override
    protected void cashOut() {

    }
}
