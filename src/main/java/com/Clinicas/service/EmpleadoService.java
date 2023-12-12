/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Clinicas.service;

import com.Clinicas.domain.Empleado;
import java.util.List;

/**
 *
 * @author Dylan
 */
public interface EmpleadoService {
    
    public List<Empleado> getEmpleados();
    
    public Empleado getEmpleado(Empleado cita);
    
    public void save(Empleado cita);
    
    public void delete(Empleado cita);
    
    public Empleado getEmpleadoById(Long id);
    
}
