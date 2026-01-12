package oop;

    import java.util.ArrayList;

    public class RamenTest
public static void main(String[] args) 

        RamenFlavor a = new SpicyMeatFlavor( "Spicy Beef", true, 900, "beef", true, 3, false);
        RamenFlavor b = new VeganVegetarianFlavor("Miso Veggie", false, 650, true, true, true, true);

        ArrayList<RamenFlavor> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        System.out.println(a instanceof MeatBasedFlavor); // checks obj type when running   
        System.out.println(b instanceof VegetarianFlavor);     

        a.setSodium(720);                                     
        System.out.println(a.getSodium());                    

        for (RamenFlavor f : list) {
            System.out.println(f.describeFlavor()); // polymorphism -one parent has the ability to refer to multiple child types
        }

    