package com.Clinicas.dao;

import com.Clinicas.domain.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenDao extends JpaRepository<Examen, Long>{
    
}
