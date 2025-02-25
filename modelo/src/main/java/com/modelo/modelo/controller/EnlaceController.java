package com.modelo.modelo.controller;

import com.modelo.modelo.dto.EnlaceDTO;
import com.modelo.modelo.dto.UsuarioDTO;
import com.modelo.modelo.model.Enlace;
import com.modelo.modelo.model.Usuario;
import com.modelo.modelo.service.IEnlaceService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1")
public class EnlaceController { 
    
    public final IEnlaceService iEnlaceService;

    public EnlaceController(IEnlaceService iEnlaceService) {
        this.iEnlaceService = iEnlaceService;
    }

    @GetMapping("/enlace")
    public ResponseEntity<List<EnlaceDTO>> readAll() throws Exception {
        List<Enlace> lista=iEnlaceService.readAll();
        ModelMapper modelMapper = new ModelMapper();
        List<EnlaceDTO> listadto =  lista.stream().map(e->modelMapper.map(e,EnlaceDTO.class)).toList();
        return new ResponseEntity<>(listadto, HttpStatus.ACCEPTED);
    }

    @GetMapping("enlace/{id}")
    public ResponseEntity<EnlaceDTO>  findById(@PathVariable("id") int id) throws  Exception{
        ModelMapper modelMapper= new ModelMapper();
        Enlace enlace=iEnlaceService.readById(id);
        EnlaceDTO enlaceDTO =modelMapper.map(enlace,EnlaceDTO.class);
        return new ResponseEntity<>(enlaceDTO,HttpStatus.OK) ;
    }

    @PostMapping("enlace/save")
    public ResponseEntity<Void> save(@Valid @RequestBody EnlaceDTO enlaceDTO) throws Exception {
        ModelMapper modelMapper= new ModelMapper();
        iEnlaceService.save(modelMapper.map(enlaceDTO,Enlace.class));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("enlace/{id}")
    public ResponseEntity<EnlaceDTO> update(@Valid @RequestBody EnlaceDTO enlaceDTO,@PathVariable("id") int id) throws Exception {
        ModelMapper modelMapper= new ModelMapper();
        Enlace enlace=iEnlaceService.update(modelMapper.map(enlaceDTO,Enlace.class),id);
       return  new ResponseEntity<>(modelMapper.map(enlace,EnlaceDTO.class),HttpStatus.OK);
    }
    @DeleteMapping("enlace/{id}")
    public  ResponseEntity<Void>  deleteUsuario(@PathVariable("id") int id) throws Exception {
        iEnlaceService.deleteEnlace(id);   ;
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
}
