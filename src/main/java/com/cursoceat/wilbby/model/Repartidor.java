package com.cursoceat.wilbby.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity // declaro que esta clase llama a la base de datos
public class Repartidor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fecha;
    private String vehiculo;
    private int numeroP;
    private String cobro;
    private String estado;

    // getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    public String getCobro() {
        return cobro;
    }

    public void setCobro(String cobro) {
        this.cobro = cobro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // tostring

    @Override
    public String toString() {
        return "Repartidor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fecha=" + fecha +
                ", vehiculo='" + vehiculo + '\'' +
                ", numeroP=" + numeroP +
                ", cobro='" + cobro + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}






