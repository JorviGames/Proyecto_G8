/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Clinicas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author yorvi
 */
@Entity
@Table(name = "VacunasDisponibles")
public class Vacunacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private int dosis;
    private String tipo;
    private LocalDate fechaDeCampanaStart;
    private LocalDate fechaDeCampanaEnd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaDeCampanaStart() {
        return fechaDeCampanaStart;
    }

    public void setFechaDeCampanaInicio(LocalDate fechaDeCampanaInicio) {
        this.fechaDeCampanaStart = fechaDeCampanaInicio;
    }

    public LocalDate getFechaDeCampanaEnd() {
        return fechaDeCampanaEnd;
    }

    public void setFechaDeCampanaEnd(LocalDate fechaDeCampanaEnd) {
        this.fechaDeCampanaEnd = fechaDeCampanaEnd;
    }
}
