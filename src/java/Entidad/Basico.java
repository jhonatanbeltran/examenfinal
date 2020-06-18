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
public class Basico {
    String documento;
    String nombre;
    String telefono;
    Date fechaNacimiento;
    String genero;
    int eps;
    int modalidad;
    int tipo;
    byte embarazo;
    String contactoNombre;
    String contactoTelefono;
    byte mas60;
    byte menos15;
    byte salud;
    Date fechareg;

    public Basico() {
    }

    public Basico(String documento, String nombre, String telefono, Date fechaNacimiento, String genero, int eps, int modalidad, int tipo, byte embarazo, String contactoNombre, String contactoTelefono, byte mas60, byte menos15, byte salud, Date fechareg) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.eps = eps;
        this.modalidad = modalidad;
        this.tipo = tipo;
        this.embarazo = embarazo;
        this.contactoNombre = contactoNombre;
        this.contactoTelefono = contactoTelefono;
        this.mas60 = mas60;
        this.menos15 = menos15;
        this.salud = salud;
        this.fechareg = fechareg;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public int getModalidad() {
        return modalidad;
    }

    public void setModalidad(int modalidad) {
        this.modalidad = modalidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public byte getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(byte embarazo) {
        this.embarazo = embarazo;
    }

    public String getContactoNombre() {
        return contactoNombre;
    }

    public void setContactoNombre(String contactoNombre) {
        this.contactoNombre = contactoNombre;
    }

    public String getContactoTelefono() {
        return contactoTelefono;
    }

    public void setContactoTelefono(String contactoTelefono) {
        this.contactoTelefono = contactoTelefono;
    }

    public byte getMas60() {
        return mas60;
    }

    public void setMas60(byte mas60) {
        this.mas60 = mas60;
    }

    public byte getMenos15() {
        return menos15;
    }

    public void setMenos15(byte menos15) {
        this.menos15 = menos15;
    }

    public byte getSalud() {
        return salud;
    }

    public void setSalud(byte salud) {
        this.salud = salud;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }
    
    
    
    
    
}
