package com.modelo.modelo.controller;

import com.modelo.modelo.dto.RolDTO;
import com.modelo.modelo.service.IRolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/v1")

public class RolController {
    
    public final IRolService iRolService;

    public RolController(IRolService iRolService) {
        this.iRolService = iRolService;
    }

    @GetMapping("rol")
    public List<RolDTO> ReadAll() throws Exception {
       return iRolService.readAll();
    }
}
