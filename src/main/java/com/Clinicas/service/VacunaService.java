package com.Clinicas.service;

import com.Clinicas.domain.Vacuna;
import java.util.List;


public interface VacunaService {
   
    public List<Vacuna> getVacunas();
    
    public Vacuna getVacuna(Vacuna vacuna);
    
    public void save(Vacuna vacuna);
    
    public void delete(Vacuna vacuna);
    
}
