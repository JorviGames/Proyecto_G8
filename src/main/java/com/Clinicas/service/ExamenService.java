package com.Clinicas.service;

import com.Clinicas.domain.Examen;
import java.util.List;

public interface ExamenService {
    
    public List<Examen> getExamenes();
    
    public Examen getExamen(Examen examen);
    
    public void save(Examen examen);
    
    public void delete(Examen examen);
    
    
}
