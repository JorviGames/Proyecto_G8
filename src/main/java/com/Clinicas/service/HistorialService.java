package com.Clinicas.service;

import com.Clinicas.domain.Historial;
import java.util.List;

public interface HistorialService {
    
    public List<Historial> getHistoriales();
    
    public Historial getHistorial(Historial historial);
    
    public void save(Historial historial);
    
    public void delete(Historial historial);
    
    
}
