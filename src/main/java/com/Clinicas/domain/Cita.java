package com.Clinicas.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
@Entity
@Table(name = "citas")
public class Cita implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long idCita;
    private LocalDate fecha;
    private LocalTime hora;
    private String centro;
    private String motivo;
    
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario usuario;
    

    public Cita() {
    }

    public Cita(LocalDate fecha, LocalTime hora, String centro, String motivo, Usuario usuario) {
        this.fecha = fecha;
        this.hora = hora;
        this.centro = centro;
        this.motivo = motivo;
        this.usuario = usuario;
    }
    
    
}

