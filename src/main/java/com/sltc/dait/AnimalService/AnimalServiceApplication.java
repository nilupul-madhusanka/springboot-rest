package com.sltc.dait.AnimalService;

import com.sltc.dait.AnimalService.impl.AnimalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnimalServiceApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AnimalServiceApplication.class, args);
        AnimalService serviceLion = (AnimalService) context.getBean("lionService");
        AnimalService serviceElephant = (AnimalService) context.getBean("elephantService");
        serviceLion.printSound();
        serviceElephant.printSound();
    }

}
