package com.company;

public class Main {

    public static void main(String[] args) {
        Alumno mercy = new Alumno();
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
        System.out.println(mynor.saludar());


    }
}
