package genc182002.bucles;

import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para conocer su tabla de multiplicar: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + num + "=" + num*i);
        }
    }
}
