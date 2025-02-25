package com.modelo.modelo.controller;

import com.modelo.modelo.dto.AccionDTO;
import com.modelo.modelo.model.Accion;
import com.modelo.modelo.service.IAccionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AccionController {
  
    private final IAccionService iAccionService;

  
    public AccionController(IAccionService iAccionService) {
        this.iAccionService = iAccionService;
    }
    

    @GetMapping("accion")
    public List<AccionDTO> findAll() throws Exception {
        return iAccionService.readAll();
    }
   
    
    
}
