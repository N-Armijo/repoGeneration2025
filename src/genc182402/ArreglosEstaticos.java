package genc182402;

import java.util.Arrays;
import java.util.Scanner;

public class ArreglosEstaticos {

    //los arreglos en java son estaticos/fijos por naturaleza ->No puede aumentar, ni disminuir longitud del arreglo
    int[] miArregloD = {1,2,3,4,5};

    public static void main(String[] args) {
    //Declaramos un arreglo de numeros
        int[] numerosDelUnoAlDiez = {1,2,3,4,5,6,7,8,9,10};
        //si intento imprimir un areglo estatico/fijo, se imprime unareferecia a donde esta en memoria
        System.out.println("Mis numeros del uno al 10 son (referencia)" + numerosDelUnoAlDiez);
        System.out.println("Mis numeros del uno al 10 son" + Arrays.toString(numerosDelUnoAlDiez));

        //Para acceder a un indice en particular dentro del arreglo, puedo referirme a el por su posicion
        System.out.println("El elemento en el indice 5 es " + numerosDelUnoAlDiez[5]);//6

        int[] miArregloVacio = new int [5]; //-> le esta indicando que va a tener largo 5
        System.out.println("Mi arreglo de numeros vacio (con metodo del Arrays.toString(): " + Arrays.toString(miArregloVacio));
        System.out.println("Mi arreglo de numeros vacio: " + miArregloVacio);
        miArregloVacio[0] = 55;
        System.out.println("Mi arreglo de numeros vacio que ya no esta vacio: " + Arrays.toString(miArregloVacio));
        System.out.println("Mi arreglo de numeros vacio que ya no esta vacio, accediendo con un indice " + miArregloVacio[0]);
//        System.out.println("Mi arreglo de numeros vacio que ya no esta vacio, pero indicando un indice que no existe: " + miArregloVacio[6]);//Arrojara una exception ArrayIndexOutOfBoundsException

        //Como puedo recorrer un arreglo?
        Scanner sc = new Scanner(System.in);
        int[] empty = new int[5];
        for(int i = 0; i<empty.length; i++){
            System.out.println("Ingrese un valor para el elemento en el indice " + i + ": ");
            empty[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("El numero en la posicion " + i + " ahora es " + empty[i]);
        }
        System.out.println("La lista de elementos son " + Arrays.toString(empty));

        //ForEach es un tipo de bucle para trabajar con estructuras de datos. Se introdujo alrededor de java 5(?)-> confirmar dato
        for(int elemento : empty){
            System.out.println("Elemento en este momento tiene un valor de " + elemento);
        }

    }
}
