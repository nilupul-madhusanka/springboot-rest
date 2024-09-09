package com.sltc.dait.AnimalService.impl;

import com.sltc.dait.AnimalService.api.Animal;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {
    private final Animal animal;

    public AnimalService(Animal lion) {
        this.animal = lion;
    }
    public String printSound(){
        return animal.speak();
    }
}
