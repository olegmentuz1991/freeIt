package Task26;

public class Stove extends OtherDevice {
    private int hobCount;
    boolean verification;

    public Stove(String name, int warranty, String workingType, int hobCount, boolean verification) {
        super(name, warranty, workingType);
        this.hobCount = hobCount;
        this.verification = verification;
    }


}
