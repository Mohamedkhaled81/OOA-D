package ChapterOne.RickG;

import java.util.*;

public class Inventory {
    private List guitars;
    public Inventory() {
        guitars = new LinkedList();
    }
    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        Guitar guitar = new Guitar(serialNumber, price, new GuitarSpec(builder, type, backWood, topWood, model, numString));
        guitars.add(guitar);
    }
    public Guitar getGuitar(String serialNumber) {
        for(Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for(Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            if (guitar.getSpec().matches(searchSpec))
             matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
