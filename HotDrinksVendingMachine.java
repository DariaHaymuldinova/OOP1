package OOP1;

import java.util.ArrayList;

public class HotDrinksVendingMachine implements VendingMachine { 

    private ArrayList<HotDrinkHeir> allDrinks = new ArrayList<>(); 


   public HotDrinksVendingMachine(HotDrinkHeir[] allDrinks) {
        for (HotDrinkHeir HotDrink : allDrinks) {
            this.allDrinks.add(HotDrink);
        }
    }

    public HotDrinkHeir getProduct(String name, Double volume, int temperature) {

        for (int i = 0; i < allDrinks.size(); i++) {

            if (allDrinks.get(i).volume.equals(volume) && allDrinks.get(i).name.equals(name) && allDrinks.get(i).temperature == (temperature)) {
                return allDrinks.get(i);
            }
        }
        return new HotDrinkHeir("Absence! Nothing to count as price and other ", + 0, + 0.1, + 0);
    }
}