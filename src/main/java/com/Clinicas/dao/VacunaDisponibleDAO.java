/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Clinicas.dao;

import com.Clinicas.domain.Vacunacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yorvi
 */
public interface VacunaDisponibleDAO extends JpaRepository<Vacunacion, Long> {
    
    @Override
    List<Vacunacion> findAll();
}

