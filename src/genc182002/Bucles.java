package genc182002;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
    //Bucle While
    //Contador de despegue
        int contador = 10;
        System.out.println("Contador de despegue");

        while (contador > 0) {
            contador--; // -> indica que va restando 1 por cada iteracion del ciclo a la variable contador
            System.out.println(contador);
        }
        System.out.println("Despegue");

        //Bucle Do-While -> permite qur unque la condicion sea falsa se ejecute al menos una vez
        Scanner entrada = new Scanner(System.in);
        Integer numeroMisterioso = (int) (Math.random() * 10) + 1; // -> recibe un double, pero lo casteo (transformo) a un int
        Integer numeroElegido;
        int contadorDeIntentos = 0;

        do{
            contadorDeIntentos++;
            System.out.println("Ingrese un numero entero del 1 al 10: ");
            String numero = entrada.nextLine();
            numeroElegido = Integer.parseInt(numero); // -> hace un casteo de datos. Saca el numero del mensaje -> este metodo es una vuelta larga
            if (numeroElegido.equals(numeroMisterioso)) {
                System.out.println("Felicidades, adivinaste.\nNumero de intentos: " + contadorDeIntentos    );
            } else if (numeroElegido < numeroMisterioso) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }
        }while (!numeroMisterioso.equals(numeroElegido));
    }
}
