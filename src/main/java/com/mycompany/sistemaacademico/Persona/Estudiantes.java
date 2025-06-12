/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Persona;

/**
 *
 * @author User
 */
public class Estudiantes extends PersonalInstitucional {
    private int codigo;
    //constructor

    public Estudiantes(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String agregarEstudiante(){
    return "";
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "codigo=" + codigo + super.toString()+'}';
    }
    public boolean verificarCedula(){
    return true;
    }
    
}
