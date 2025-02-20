package genc182002.algoritmosEquipo;

import java.util.Scanner;

public class SumaDigitosCifra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String num = sc.nextLine();
        int suma = 0;
        for(int i = 0; i < num.length(); i++){
            suma += Character.getNumericValue(num.charAt(i)); //Obtiene el valor del numero ingresado. Si se trata de sumar directamente toma su valor ASCII
        }
        System.out.println("Valor suma: " +suma);
    }
}
