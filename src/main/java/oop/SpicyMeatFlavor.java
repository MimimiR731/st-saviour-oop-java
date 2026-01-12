package oop;

public class SpicyMeatFlavor extends MeatBasedFlavor {

    private int heatLevel;        
    private boolean extraChili;  

    public SpicyMeatFlavor(String name, boolean spicy, int sodium, String meat, boolean strongFlavor, int heatLevel, boolean extraChili) {
        super(name, spicy, sodium, meat, strongFlavor); 
        this.heatLevel = heatLevel;
        this.extraChili = extraChili;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }

    public boolean hasExtraChili() {
        return extraChili;
    }

    public void setExtraChili(boolean extraChili) {
        this.extraChili = extraChili;
    }

    // From chart: increaseHeat()
    public void increaseHeat() {
        heatLevel++;
        setSpicy(true);
        if (heatLevel >= 5) {
            extraChili = true;
        }
    }

    @Override
    public String describeFlavor() {
        return super.describeFlavor() + " Heat level: " + heatLevel + (extraChili ? " (extra chili added)." : ".");
    }

    @Override
    public void describeFlavorBrief() {
        System.out.println(getName() + " (spicy meat) HL=" + heatLevel);
    }
}
