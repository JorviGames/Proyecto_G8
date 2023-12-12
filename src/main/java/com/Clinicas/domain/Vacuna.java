/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clinicas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author yorvi
 */
@Entity
@Table(name = "citas_vacunacion")
public class Vacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vacuna;

    private LocalDate fechaCita;
    private LocalTime horaCita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Long getId_vacuna() {
        return id_vacuna;
    }

    public void setId_vacuna(Long id_vacuna) {
        this.id_vacuna = id_vacuna;
    }

    public LocalDate getfechaCita() {
        return fechaCita;
    }

    public void setFecha_vacuna(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime gethoraCita() {
        return horaCita;
    }

    public void setHora_vacuna(LocalTime horaCita) {
        this.horaCita = horaCita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}