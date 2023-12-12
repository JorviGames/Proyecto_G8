package com.Clinicas.service.impl;

import com.Clinicas.dao.VacunaDao;
import com.Clinicas.domain.Vacuna;
import com.Clinicas.service.VacunaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacunaServiceImpl implements VacunaService {

    private final VacunaDao vacunaDao;

    @Autowired
    public VacunaServiceImpl(VacunaDao vacunaDao) {
        this.vacunaDao = vacunaDao;
    }

    @Override
    public void guardarVacuna(Vacuna vacuna) {
        vacunaDao.save(vacuna);
    }

}
