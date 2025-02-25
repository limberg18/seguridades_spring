package com.modelo.modelo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mapper {
    
    @Bean
    public ModelMapper getMapper(){
        ModelMapper modelMapper= new ModelMapper();
        return  modelMapper;
    }
}
