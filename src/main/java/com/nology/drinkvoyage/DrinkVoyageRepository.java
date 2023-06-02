package com.nology.drinkvoyage;

import java.util.ArrayList;
import java.util.List;

public class DrinkVoyageRepository {

    private final List<Drink> drinks = new ArrayList<>();


    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

}