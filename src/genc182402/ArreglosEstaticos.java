package genc182402;

import java.util.Arrays;

public class ArreglosEstaticos {

    //los arreglos en java son estaticos/fijos por naturaleza ->No puede aumentar, ni disminuir longitud del arreglo
    int[] miArregloD = {1,2,3,4,5};
	int[] miArregloDeNumeros = new int [5]; //-> le esta indicando que va a tener largo 5

    public static void main(String[] args) {
    //Declaramos un arreglo de numeros
        int[] numerosDelUnoAlDiez = {1,2,3,4,5,6,7,8,9,10};
        //si intento imprimir un areglo estatico/fijo, se imprime unareferecia a donde esta en memoria
        System.out.println("Mis numeros del uno al 10 son (referencia)" + numerosDelUnoAlDiez);
        System.out.println("Mis numeros del uno al 10 son" + Arrays.toString(numerosDelUnoAlDiez));

        //Para acceder a un indice en particular dentro del arreglo, puedo referirme a el por su posicion
        System.out.println("El elemento en el indice 5 es " + numerosDelUnoAlDiez[5]);//6


    }
}
