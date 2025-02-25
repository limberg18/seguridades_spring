package com.modelo.modelo.service.impl;

import com.modelo.modelo.model.Objeto;
import com.modelo.modelo.repo.IObjetoRepo;
import com.modelo.modelo.service.IObjetoService;

import java.util.List;

public class ObjetoServiceImpl implements IObjetoService {
    public final IObjetoRepo iObjetoRepo;

    public ObjetoServiceImpl(IObjetoRepo iObjetoRepo) {
        this.iObjetoRepo = iObjetoRepo;
    }

    @Override
    public List<Objeto> readAll() throws Exception {
        return iObjetoRepo.findAll();
    }

    @Override
    public Objeto readById(int id) throws Exception {
        return iObjetoRepo.findById(id).orElseThrow(() -> new Exception("El objeto con " + id +" No existe"));
    }

    @Override
    public void save(Objeto objeto) throws Exception {
           iObjetoRepo.save(objeto);
    }

    @Override
    public Objeto update(Objeto objeto, int id) throws Exception {
        Objeto obj=iObjetoRepo.findById(id).orElseThrow(() -> new Exception("No existe el objeto " + id));
        obj.setNombre(objeto.getNombre());
        return obj;
    }

    @Override
    public void deleteObjeto(int id) throws Exception {

    }
}
