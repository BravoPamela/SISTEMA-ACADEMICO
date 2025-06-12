/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.profesores;

import com.mycompany.sistemaacademico.personalacademico.PersonalAcademico;

/**
 *
 * @author User
 */
public class Profesor extends PersonalAcademico {
    private Escalafon escalafon;
    //constructor

    public Profesor(Escalafon escalafon, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.escalafon = escalafon;
    }
    //set y get

    public Escalafon getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }
    public String agregarProfesor(){
    return "";
    }

    @Override
    public String toString() {
        return "Profesores{" + "escalafon=" + escalafon + super.toString()+ '}';
    }
    public boolean verificarCedula(){
    return true;
    }
    
}
