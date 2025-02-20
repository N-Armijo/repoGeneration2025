package genc182002;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        numero = entrada.nextInt();
//        if (numero % 2 == 0) {
//            System.out.println("El numero " + numero + " es par");
//        } else {
//            System.out.println("El numero " + numero + " es impar");
//        }

        //VERSION CON OPERADORES TERNARIOS
        String mensaje = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println(mensaje);
        entrada.close(); //NO OLVIDAR CERRAR EL Scanner!!!!!!!!!!!
    }
}
