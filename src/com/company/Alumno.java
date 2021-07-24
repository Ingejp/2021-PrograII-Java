package com.company;

import java.util.Date;

public class Alumno {
    private String carne;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int indice;

    //Constructor #1: Es un método especial de la clase, que se encarga de inicializar los valores de la clase
   public Alumno(){
       this.indice=1;
   }
    //Constructor #2
   public Alumno(String nombre, String apellido){
       this.nombre=nombre;
       this.apellido=apellido;
   }

    public void realizarTareas(){
        //
    }

    public String saludar(){
       return "Hola mi nombre es : " + this.nombre + " " + this.apellido;
    }

   public String obtenerNombre(){
       return "";
   }

   public String obtenerNumeroCarne(){
       return "";
   }

   public void establecerNombre(String parametroNombre){
        this.nombre=parametroNombre;
   }


}
