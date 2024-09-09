package com.sltc.dait.AnimalService.config;


import com.sltc.dait.AnimalService.impl.AnimalService;
import com.sltc.dait.AnimalService.impl.Elephant;
import com.sltc.dait.AnimalService.impl.Lion;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class AnimalConfig {
    private final Elephant elephant;
    private final Lion lion;

    @Bean
    public AnimalService lionService() {
        return new AnimalService(lion);
    }
    @Bean
    public AnimalService elephantService() {
        return new AnimalService(elephant);
    }
}
