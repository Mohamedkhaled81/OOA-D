package ChapterOne.RickG;

import java.util.Iterator;
import java.util.List;

public class RickGuitars {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec( Builder.FENDER,  Type.ELECTRIC, Wood.ALDER, Wood.ALDER,"Stratocastor");
        List matchingGuitars = inventory.search(whatErinLikes);
        if(!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like guitars: ");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " " + spec.getBackWood() + " " + spec.getTopWood() + " " + guitar.getPrice());
            }
        }else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V95673", 1590.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V95673", 1590.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}