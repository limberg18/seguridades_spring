package com.modelo.modelo.service;

import com.modelo.modelo.model.Enlace;
import com.modelo.modelo.model.Objeto;

import java.util.List;

public interface IObjetoService {
    
    List<Objeto> readAll() throws Exception;
    Objeto readById(int id) throws  Exception;
    void save(Objeto objeto) throws Exception;
    Objeto update(Objeto objeto,int id) throws  Exception;
    void deleteObjeto(int id) throws Exception;
}
