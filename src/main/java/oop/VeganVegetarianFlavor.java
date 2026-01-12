package oop;

public class VeganVegetarianFlavor extends VegetarianFlavor {
    
    private boolean organic;
    private boolean lowSodium;

    public static final String VEGAN_VEGETARIAN_STATUS = "VEGAN/VEGETARIAN"; // cannot be changed/overridden

    public VeganVegetarianFlavor(String name, boolean spicy, int sodium, boolean veganFriendly, boolean mushrooms, boolean organic, boolean lowSodium) {
        super(name, spicy, sodium, veganFriendly, mushrooms); 
        this.organic = organic;
        this.lowSodium = lowSodium;

        // if it's marked lowSodium, enforce it a bit
        if (lowSodium && getSodium() > 720) {
            setSodium(720);
        }
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    public boolean isLowSodium() {
        return lowSodium;
    }

    public void setLowSodium(boolean lowSodium) {
        this.lowSodium = lowSodium;
    }

    // From chart: isVegan()
    public boolean isVegan() {
        // vegan if veganFriendly is true
        return isVeganFriendly();
    }

    @Override
    public boolean isHealthy() {
        // low-sodium option is healthy
        if (lowSodium) return true;
        return super.isHealthy();
    }

    @Override
    public String describeFlavor() {
        String org = organic ? "organic" : "not organic";
        String ls = lowSodium ? "low sodium" : "regular sodium";
        return super.describeFlavor() + " (" + VEGAN_VEGETARIAN_STATUS + ", " + org + ", " + ls + ")";
    }

    @Override
    public void describeFlavorBrief() {
        System.out.println(getName() + " (vegan/veg) " + (organic ? "organic" : "regular"));
    }
}