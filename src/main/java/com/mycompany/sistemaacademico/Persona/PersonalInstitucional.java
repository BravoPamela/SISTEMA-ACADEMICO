/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Persona;

import com.mycompany.sistemaacademico.personas.Persona;

/**
 *
 * @author User
 */
public abstract class PersonalInstitucional extends Persona {
    private String correoInstitucional;
    //constructor

    public PersonalInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    @Override
    public String toString() {
        return "PersonalInstitucional{" + "correoInstitucional=" + correoInstitucional + super.toString()+'}';
    }
    
    public abstract boolean verificarCedula();
    
}
