package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Alumno mercy = new Alumno();
        Alumno angel= new Alumno();
        Alumno andy = new Alumno();
        Alumno mario = new Alumno();
        Alumno mynor = new Alumno("Mynor Ivan", "Aldana");

        mercy.establecerNombre("Mercy Salomé");
        angel.establecerNombre("Angel Antonio");
        andy.establecerNombre("Andy Gerardo");
        mario.establecerNombre("Mario Alberto");

        System.out.println(mercy.saludar());
        System.out.println(angel.saludar());
        System.out.println(andy.saludar());
        System.out.println(mario.saludar());
        System.out.println(mynor.saludar());*/
        RegistroAlumno registros = new RegistroAlumno(10);
        Scanner entredaDeTeclado = new Scanner(System.in);

        //registro del primer alumno
        System.out.println("Ingresar nombre del alumno a registrar");
        String nombreAlumno = entredaDeTeclado.nextLine();
        if(registros.registrarAlumno(nombreAlumno)==true){
            System.out.println("Alumno registrado exitosamente");
        }else{
            System.out.println("El alumno ya está registrado");
        }

        //registro del segundo alumno
        System.out.println("Ingresar nombre del alumno a registrar");
        String nombreAlumno2 = entredaDeTeclado.nextLine();
        if(registros.registrarAlumno(nombreAlumno2)==true){
            System.out.println("Alumno registrado exitosamente");
        }else{
            System.out.println("El alumno ya está registrado");
        }

        //codigo para recorrer el vector de alumnos registrados
        String[] vector = registros.obtenerAlumnosRegistrados();
        System.out.println("Lista de Alumnos Registrados " + '\n');
        for(int i=0; i<vector.length; i++){
            //if(vector[i]!=null) // otra forma de escribirlo
            if(!(vector[i]==null)){//se valida si el registro no es nulo
                System.out.println(vector[i]);
            }
        }

    }
}
