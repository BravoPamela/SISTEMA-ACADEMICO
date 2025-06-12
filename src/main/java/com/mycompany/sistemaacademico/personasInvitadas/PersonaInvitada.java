/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.personasInvitadas;

import com.mycompany.sistemaacademico.personas.Persona;

/**
 *
 * @author User
 */
public class PersonaInvitada extends Persona {
    private String descripcion;
//constructor
    public PersonaInvitada(String descripcion, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.descripcion = descripcion;
    }
    //set y get

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    @Override
    public String toString (){
    return "PersonaInvitada{"+ ']'+super.toString ()+"]";
            
    }
    public boolean verificarCedula (){
    return true;
    }
    
}
