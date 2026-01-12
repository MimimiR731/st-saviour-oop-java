package oop;

public class MeatBasedFlavor extends RamenFlavor {

    private String meat;
    private boolean strongFlavor;

    public MeatBasedFlavor(String name, boolean spicy, int sodium, String meat, boolean strongFlavor) {
        super(name, spicy, sodium); // used to refer to parent class in a child class 
        this.meat = meat;
        this.strongFlavor = strongFlavor;
    }
    
    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
    
    public boolean hasStrongFlavor() {
        return strongFlavor;
    } 

    public void setStrongFlavor(boolean strongFlavor) {
        this.strongFlavor = strongFlavor;
    }

    public void addMeatFlavoring() {
        setSodium(getSodium() + 50);
        strongFlavor = true;
    }

@Override
    public String describeFlavor() {
        String spiceText = isSpicy() ? "spicy" : "not spicy";
        String strengthText = strongFlavor ? "strong" : "mild";
        return getName() + " is a " + spiceText + " " + meat + " ramen with a " + strengthText + " broth.";
    }

    @Override
    public void describeFlavorBrief() {
        System.out.println(getName() + " (" + meat + ")");
    }
}
