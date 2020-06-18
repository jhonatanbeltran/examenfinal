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
public class Cormobilidad {
    
    int id;
    byte diabetes;
    byte cardio;
    byte cerebro;
    byte vih;
    byte cancer;
    byte corticoides;
    byte epoc;
    byte nutricion;
    byte fumador;
    Date fechareg;

    public Cormobilidad() {
    }

    public Cormobilidad(int id, byte diabetes, byte cardio, byte cerebro, byte vih, byte cancer, byte corticoides, byte epoc, byte nutricion, byte fumador, Date fechareg) {
        this.id = id;
        this.diabetes = diabetes;
        this.cardio = cardio;
        this.cerebro = cerebro;
        this.vih = vih;
        this.cancer = cancer;
        this.corticoides = corticoides;
        this.epoc = epoc;
        this.nutricion = nutricion;
        this.fumador = fumador;
        this.fechareg = fechareg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(byte diabetes) {
        this.diabetes = diabetes;
    }

    public byte getCardio() {
        return cardio;
    }

    public void setCardio(byte cardio) {
        this.cardio = cardio;
    }

    public byte getCerebro() {
        return cerebro;
    }

    public void setCerebro(byte cerebro) {
        this.cerebro = cerebro;
    }

    public byte getVih() {
        return vih;
    }

    public void setVih(byte vih) {
        this.vih = vih;
    }

    public byte getCancer() {
        return cancer;
    }

    public void setCancer(byte cancer) {
        this.cancer = cancer;
    }

    public byte getCorticoides() {
        return corticoides;
    }

    public void setCorticoides(byte corticoides) {
        this.corticoides = corticoides;
    }

    public byte getEpoc() {
        return epoc;
    }

    public void setEpoc(byte epoc) {
        this.epoc = epoc;
    }

    public byte getNutricion() {
        return nutricion;
    }

    public void setNutricion(byte nutricion) {
        this.nutricion = nutricion;
    }

    public byte getFumador() {
        return fumador;
    }

    public void setFumador(byte fumador) {
        this.fumador = fumador;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }
    
    
    
}
