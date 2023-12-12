/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Clinicas.service;

import com.Clinicas.domain.Vacunacion;
import java.util.List;

/**
 *
 * @author yorvi
 */
public interface VacunaDisponibleService {
    
    List<Vacunacion> obtenerVacunasDisponibles();
}
