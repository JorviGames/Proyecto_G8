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

    private LocalDate fecha_vacuna;
    private LocalTime hora_vacuna;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Long getId_vacuna() {
        return id_vacuna;
    }

    public void setId_vacuna(Long id_vacuna) {
        this.id_vacuna = id_vacuna;
    }

    public LocalDate getFecha_vacuna() {
        return fecha_vacuna;
    }

    public void setFecha_vacuna(LocalDate fecha_vacuna) {
        this.fecha_vacuna = fecha_vacuna;
    }

    public LocalTime getHora_vacuna() {
        return hora_vacuna;
    }

    public void setHora_vacuna(LocalTime hora_vacuna) {
        this.hora_vacuna = hora_vacuna;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}