package com.nology.drinkvoyage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;


@Component
public class DrinkVoyageInitializer {



    @Value("classpath:beers.json")
    private Resource resourceFile;




}
