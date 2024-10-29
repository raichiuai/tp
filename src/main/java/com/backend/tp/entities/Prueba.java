package com.backend.tp.entities;

import jakarta.persistence.*;

@Entity
public class Prueba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "ID_VEHICULO")
    private Vehiculo vehiculo;

    @OneToOne
    @JoinColumn(name = "ID_INTERESADO")
    private Interesado interesado;

    @OneToOne
    @JoinColumn(name = "ID_EMPLEADO")
    private Empleado empleado;

    @Column(name = "FECHA_HORA_INICIO")
    private String fechaHoraInicio;

    @Column(name = "FECHA_HORA_FIN")
    private String fechaHoraFin;

    @Column(name = "COMENTARIOS")
    private String comentarios;

    public Prueba() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Interesado getInteresado() {
        return interesado;
    }

    public void setInteresado(Interesado interesado) {
        this.interesado = interesado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(String fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public String getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(String fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
