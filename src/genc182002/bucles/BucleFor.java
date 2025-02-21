package genc182002.bucles;

import genc182102.Funciones;

import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para conocer su tabla de multiplicar: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + num + "=" + num*i);
        }

        Funciones miFuncion = new Funciones(); //->Aqui como es publico puedo acceder
        System.out.println(miFuncion);
        //System.out.println(Funciones.nombre); -> Si fuera declara static, solo puedo usarla directamente desde la clase, NO desde la instancia
        //System.out.println(miFuncion.nombre);// -> No puede acceder porque es privada
        System.out.println(miFuncion.apellido);// -> Solo puede acceder porque es publica
        System.out.println(Funciones.segundoNombre);// -> Static Solo se accede desde la clase misma, NO una INSTANCIA
        //System.out.println(miFuncion.segundoApellido);// -> No es accesible, ya que Solo se accede desde la clase misma, clases HIJAS o mismo PACKAGE
        System.out.println(miFuncion.suma(10,10));
    }
}
