package com.nology.drinkvoyage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@RestController
public class DrinkVoyageController {

@Autowired
DrinkVoyageService drinkVoyageService;






    @GetMapping("/home")
    public Drink createDrink(@RequestBody Drink drink){
        drinkVoyageService.addDrink(drink);
        return drink;
    }

}
