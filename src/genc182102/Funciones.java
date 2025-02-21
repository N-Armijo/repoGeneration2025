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

        sc.close(); //Cierro la instancia
    }

    //funciones que no son estaticas requieren de instanciar la clase
    public int suma(int a, int b){
        return a+b;
    }

    //Funciones que son estaticas le pertenecen a la clase, por tanto no necesitan ser llamadas de una instancia para llamarlas
    public static int resta (int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        saludo(); //LLamo a la funcion
        //Creo primero la instancia
        Funciones miFuncion = new Funciones();
        int resultado = miFuncion.suma(10,10);
        System.out.println("Esta es la instancia que se creo:" + miFuncion); // Que es lo que esta retonando -?
        System.out.println("El resultado de la funcion suma es: " + resultado);
        System.out.println("El resultado de la funcion resta es: " + Funciones.resta(10,5));

        //Esto es un ejemplo de una clase estatica porque le pertenece a la clase Math
        Math.random();

        Scanner miOtroScanner = new Scanner(System.in);
        //La funcion nextLine viene a ser un ejemplo de funcion de instancia
        String nombre = miOtroScanner.nextLine();
        miOtroScanner.close();
    }
}
