package com.example.menuapp;
public class Establecimiento {
    private int id;
    private String nombre;
    private String direccion;
    private String tipo;
    private String descripcion;
    private String telefono;
    private int favorito;
    private String urlEstablecimiento;
    private String logo;

    // Constructor, getters y setters
    public Establecimiento(int id, String nombre, String direccion, String tipo, String descripcion, String telefono, int favorito, String urlEstablecimiento, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.favorito = favorito;
        this.urlEstablecimiento = urlEstablecimiento;
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getFavorito() {
        return favorito;
    }

    public String getUrlEstablecimiento() {
        return urlEstablecimiento;
    }

    public String getLogo() {
        return logo;
    }
}
