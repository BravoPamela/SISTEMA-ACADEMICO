/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.Persona.Estudiantes;
import com.mycompany.sistemaacademico.personasInvitadas.PersonaInvitada;
import com.mycompany.sistemaacademico.Persona.PersonaServicios;


/**
 *
 * @author User
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        System.out.println(".....Datos de Persona Invitada......");
        PersonaInvitada invi= new PersonaInvitada ("hombre", 3, "Veronica", "@vero_1230", "0321456");
        System.out.println(""+invi.toString());
        System.out.println("....Datos de Estudiante.......");
        Estudiantes estudiante=new Estudiantes (321, "@pame.espoch", 10, "Pamela Bravo", "@pame.b","78945" );
        System.out.println(""+estudiante.toString());
        System.out.println(".......Datos del Personal de Servicio......");
        PersonaServicios servicio=new PersonaServicios ("gremio", 1210, "patricia@gmail", 26, "Liset", "@lis.12", "36985");
        System.out.println(""+servicio.toString());
        
   
    }
}