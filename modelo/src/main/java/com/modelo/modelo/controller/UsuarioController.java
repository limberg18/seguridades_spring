package com.modelo.modelo.controller;
import com.modelo.modelo.dto.UsuarioDTO;
import com.modelo.modelo.model.Usuario;
import com.modelo.modelo.service.IAccionService;
import com.modelo.modelo.service.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/v1")
public class UsuarioController {
    private  final IUsuarioService iUsuarioService;
    public UsuarioController(IUsuarioService iUsuarioService, IAccionService iAccionService) {
        this.iUsuarioService = iUsuarioService;
       
    }
    @GetMapping("usuario")
    public ResponseEntity<List<UsuarioDTO>>  readAll() throws Exception {
     return  new ResponseEntity<>( iUsuarioService.readAll(),HttpStatus.OK);
    }
    
    @GetMapping("usuario/{id}")
    public ResponseEntity<UsuarioDTO>  findById(@PathVariable("id") int id) throws  Exception{
        return new ResponseEntity<>( iUsuarioService.readById(id),HttpStatus.OK) ;
    }
    
    @PostMapping("usuario/save")
    public ResponseEntity<Void> save(@Valid @RequestBody UsuarioDTO usuariodto) throws Exception {
        iUsuarioService.save(usuariodto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("usuario/{id}")
    public ResponseEntity<UsuarioDTO> update(@Valid @RequestBody UsuarioDTO usuarioDTO,@PathVariable("id") int id) throws Exception {
      return  new ResponseEntity<>(iUsuarioService.update(usuarioDTO,id),HttpStatus.OK);
        
    }
    @DeleteMapping("usuario/{id}")
    public  ResponseEntity<Void>  deleteUsuario(@PathVariable("id") int id) throws Exception {
        iUsuarioService.deleteUsuario(id)   ;
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/getname/{name}")
    public UsuarioDTO getName(@PathVariable("name") String name){
        return iUsuarioService.getUsuarioName(name);
    }
    
  @GetMapping("/getUsuarioEntidad/{id}")
    public List<UsuarioDTO> getUsuarioEntidad(@PathVariable("id") Integer id){
        return  iUsuarioService.getUsuarioEntidad(id);
        
  }
    
}
