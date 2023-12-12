package com.Clinicas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "examenes")
public class Examen implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Examen")
    private long idExamen;
    private LocalDate fecha;
    private String descripcion;
    private String tipo;
    private String resultado;
    
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario usuario;
    
    public Examen() {
    }

    public Examen(LocalDate fecha, String descripcion, String tipo, String resultado, Usuario usuario) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.resultado = resultado;
        this.usuario = usuario;
    }
    
    
    
    
    
}
