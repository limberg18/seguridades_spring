package com.modelo.modelo.service.impl;

import com.modelo.modelo.model.Enlace;
import com.modelo.modelo.model.Usuario;
import com.modelo.modelo.repo.IEnlaceRepo;
import com.modelo.modelo.service.IEnlaceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnlaceServiceImpl implements IEnlaceService {
   public final IEnlaceRepo  iEnlaceRepo;
    public EnlaceServiceImpl(IEnlaceRepo iEnlaceRepo) {
        this.iEnlaceRepo = iEnlaceRepo;
    }
    @Override
    public List<Enlace> readAll() throws Exception {
        return iEnlaceRepo.findAll();
    }
    @Override
    public Enlace readById(int id) throws Exception {
        return iEnlaceRepo.findById(id).orElseThrow(()->new Exception("el enlace con "+id+" no existe"));
    }
    @Override
    public void save(Enlace enlace) throws Exception {
          iEnlaceRepo.save(enlace);
    }
    @Override
    public Enlace update(Enlace enlace, int id) throws Exception {
        Enlace enla = iEnlaceRepo.findById(id)
                .orElseThrow(() -> new Exception("Acción no encontrada con id: " + id));
        enla.setNombre(enlace.getNombre());
        enla.setRuta(enlace.getRuta());
        enla.setEnlacePadreId(enlace.getEnlacePadreId());
        return iEnlaceRepo.save(enla);
       
    }
    @Override
    public void deleteEnlace(int id) throws Exception {
     iEnlaceRepo.deleteById(id);
    }
}
