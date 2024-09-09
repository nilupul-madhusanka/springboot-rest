package com.sltc.dait.AnimalService.impl;

import com.sltc.dait.AnimalService.api.Animal;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {
    @Override
    public String speak(){
        return "Roar Roar Roar Roar";
    }
}