package Task26;

public class OtherDevice extends HouseholdAppliance {
    private String workingType;
    public OtherDevice(String brand, int warranty,String workingType) {
        super(brand, warranty);
        this.workingType = workingType;
    }

}
