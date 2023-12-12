package com.Clinicas.service.impl;

import com.Clinicas.dao.ExamenDao;
import com.Clinicas.domain.Examen;
import com.Clinicas.service.ExamenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExamenServiceImpl implements ExamenService{

    @Autowired
    private ExamenDao examenDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Examen> getExamenes() {
        return examenDao.findAll();
        
    }

    @Override
    public Examen getExamen(Examen examen) {
        
        return examenDao.findById(examen.getIdExamen()).orElse(null);
    }

    @Override
    public void save(Examen examen) {
        examenDao.save(examen);
    }

    @Override
    public void delete(Examen examen) {
        examenDao.delete(examen);
    }

    @Override
    public Examen getExamenById(Long id) {
        
        return examenDao.findById(id).orElse(null);
    }
    
}
