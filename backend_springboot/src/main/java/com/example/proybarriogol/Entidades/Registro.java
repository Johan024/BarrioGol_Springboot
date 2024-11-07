package com.example.proybarriogol.Entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")
public class Registro {

    @Id
    @Column(name = "documento", length = 50, nullable = false)
    private String documento;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "ciudad", length = 50, nullable = false)
    private String ciudad;

    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;

    @Column(name = "telefono", length = 50, nullable = false)
    private String telefono;

    @Column(name = "correo", length = 50, nullable = false)
    private String correo;

    @Column(name = "contraseña", length = 50, nullable = false)
    private String contraseña;

    @Column(name = "fecha_nacimiento", length = 50, nullable = true)
    private String fechaNacimiento;

    public Registro(){

    }

    public Registro(String documento, String nombre, String ciudad, String descripcion, String telefono, String correo, String contraseña, String fechaNacimiento) {
        this.documento = documento;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
