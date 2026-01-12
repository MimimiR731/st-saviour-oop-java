package oop;

public abstract class RamenFlavor implements FlavorProfile {

    private String name; // private limits accessability of a class 
    private boolean spicy;
    private int sodium;

    public RamenFlavor(String name, boolean spicy, int sodium) {
        this.name = name; // refers to a current obj
        this.spicy = spicy;
        this.sodium = sodium;
    }
     
    public String getName() {
        return name;
    }

    public void setName(){
        this.name = name;
    }
    
    public boolean isSpicy() {
        return spicy;
    } 

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    @Override
    public boolean isHealthy() {
        return sodium <= 720; // setting rule it is healthy if <= 720
    }

    public abstract void describeFlavorBrief();

}
