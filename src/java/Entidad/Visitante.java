/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author JHONATAN
 */
public class Visitante {
    
    int id;
    String documento;
    String nombre;
    Date fechaNacimiento;
    int eps;
    String genero;
    int empresa;

    public Visitante() {
    }

    public Visitante(int id, String documento, String nombre, Date fechaNacimiento, int eps, String genero, int empresa) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.eps = eps;
        this.genero = genero;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }
    
    
}
