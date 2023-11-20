package com.Clinicas.service;

import com.Clinicas.domain.Cita;
import java.util.List;

public interface CitaService {
    
    public List<Cita> getCitas();
    
    public Cita getCita(Cita cita);
    
    public void save(Cita cita);
    
    public void delete(Cita cita);
    
    
}
