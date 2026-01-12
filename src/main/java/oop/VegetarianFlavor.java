package oop;

public class VegetarianFlavor extends RamenFlavor {

    private boolean veganFriendly;
    private boolean mushrooms;

    public VegetarianFlavor(String name, boolean spicy, int sodium, boolean veganFriendly, boolean mushrooms) {
        super(name, spicy, sodium);
        this.veganFriendly = veganFriendly;
        this.mushrooms = mushrooms;
    }

    public boolean isVeganFriendly() {
        return veganFriendly;
    }

    public void setVeganFriendly(boolean veganFriendly) {
        this.veganFriendly = veganFriendly;
    }

    public boolean hasMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public void addVegetables() {
        // adding vegetables reduces sodium 
        setSodium(Math.max(0, getSodium() - 30));
    }

    @Override
    public String describeFlavor() {
        String vf = veganFriendly ? "vegan-friendly" : "vegetarian";
        String mush = mushrooms ? "with mushrooms" : "no mushrooms";
        return getName() + " is " + vf + ", " + mush + ", and " + (isSpicy() ? "spicy." : "not spicy.");
    }

    @Override
    public void describeFlavorBrief() {
        System.out.println(getName() + " (veg base)");
    }
}
