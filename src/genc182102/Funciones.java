package genc182102;

import java.util.Scanner;

public class Funciones {
    //Modificadores de acceso

    private String nombre;
    public static  String segundoNombre;
    public String apellido;
    protected String segundoApellido;
    public static void saludo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tu segundo nombre: ");
        segundoNombre = sc.nextLine();
        System.out.println("Hola, " + segundoNombre + "!");//Aqui solo puede acceder a lo que dice static. Sino lo tiene , La clase no sabe que le pertenece
    }
    public static void main(String[] args) {
        saludo(); //LLamo a la funcion
    }
}
