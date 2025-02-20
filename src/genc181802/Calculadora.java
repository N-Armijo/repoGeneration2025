package genc181802;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;


        do {
            try {
                System.out.println("""
                \nBienvenido a la Calculadora
                Por favor, selecciona una operación:
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Potencia
                6. Salir
                """);

                int opcion = scanner.nextInt();

                if (opcion == 6) {
                    continuar = false; // Salir del bucle
                    System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                    break;
                }

                System.out.println("Ingresa el primer número:");
                double num1 = scanner.nextDouble();

                System.out.println("Ingresa el segundo número:");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            continue; // Volver al inicio del bucle
                        }
                        break;
                    case 5:
                        resultado = Math.pow(num1 , num2);
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                        continue; // Volver al inicio del bucle
                }

                System.out.println("El resultado es: " + resultado);

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingresa números válidos.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        } while (continuar);

        scanner.close(); // Cerrar el scanner al finalizar
    }
}