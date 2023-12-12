package com.Clinicas.service.impl;

import com.Clinicas.dao.CitaDao;
import com.Clinicas.domain.Cita;
import com.Clinicas.service.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao citaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cita> getCitas() {
        return citaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cita getCita(Cita cita) {
        return citaDao.findById(cita.getIdCita()).orElse(null);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Cita getCitaById(Long id) {
        
        return citaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cita cita) {
        citaDao.save(cita);
    }

    @Override
    @Transactional
    public void delete(Cita cita) {
        citaDao.delete(cita);
    }

}
