/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clinicas.service.impl;

import com.Clinicas.dao.VacunaDisponibleDAO;
import com.Clinicas.domain.Vacunacion;
import com.Clinicas.service.VacunaDisponibleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yorvi
 */
@Service
public class VacunaDisponibleServiceImpl implements VacunaDisponibleService {

    private final VacunaDisponibleDAO vacunaDisponibleDAO;

    @Autowired
    public VacunaDisponibleServiceImpl(VacunaDisponibleDAO vacunaDisponibleDAO) {
        this.vacunaDisponibleDAO = vacunaDisponibleDAO;
    }

    @Override
    public List<Vacunacion> obtenerVacunasDisponibles() {
        return vacunaDisponibleDAO.findAll();
    }
}

