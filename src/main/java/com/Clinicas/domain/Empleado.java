package com.Clinicas.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class Empleado implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado")
    private Long idEmpleado;
    private String nombre;
    private String apellidos;
    private String identificacion;
    private String puesto;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String identificacion, String puesto, int salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.puesto = puesto;
        this.salario = salario;
    }

    
    
}
