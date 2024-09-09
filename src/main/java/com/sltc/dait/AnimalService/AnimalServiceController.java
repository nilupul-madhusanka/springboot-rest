package com.sltc.dait.AnimalService;

import com.sltc.dait.AnimalService.impl.AnimalService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalServiceController {
    AnimalService lionService;
    AnimalService elephantService;

    @Autowired @Qualifier("lionService")
    public void setLionService(AnimalService lionService) {
        this.lionService = lionService;
    }
    @Resource(name = "elephantService")
    public void setElephantService(AnimalService elephantService) {
        this.elephantService = elephantService;
    }
    @RequestMapping("/lion")
    public String printLion() {
        return lionService.printSound();
    }
    @RequestMapping("/elephant")
    public String printElephant() {
        return elephantService.printSound();
    }
}
