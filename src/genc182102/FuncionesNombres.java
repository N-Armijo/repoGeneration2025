package genc182102;

import java.util.Scanner;

public class FuncionesNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = getValidStringInput(scanner);

        // Pedir al usuario que ingrese su apellido
        System.out.print("Ingrese su apellido: ");
        String apellido = getValidStringInput(scanner);

        // Llamadas a las funciones
        printNameLength(nombre);
        printNameCharacters(nombre);
        printFullName(nombre, apellido);
        printReverseName(nombre);

        scanner.close();
    }

    // Funcion para validar que la entrada es una cadena de texto valida
    public static String getValidStringInput(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if (input.matches("[a-zA-Z]+")) { //letra minusculas de la a-z y mayusculas A-Z y el + indica al menos 1 caracter
                return input;
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese solo letras:");
            }
        }
    }

    // Funcion para imprimir la longitud del nombre
    public static void printNameLength(String nombre) {
        System.out.println("La longitud del nombre es: " + nombre.length());
    }

    // Funcion para imprimir cada carácter del nombre
    public static void printNameCharacters(String nombre) {
        System.out.println("Los caracteres del nombre son:");
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
    }

    // Funcion para imprimir el nombre completo
    public static void printFullName(String nombre, String apellido) {
        System.out.println("El nombre completo es: " + nombre + " " + apellido);
    }

    // Funcion para imprimir el nombre en orden inverso
    public static void printReverseName(String nombre) {
        System.out.println("El nombre en orden inverso es:");
        for (int i = nombre.length() - 1; i >= 0; i--) {
            System.out.print(nombre.charAt(i));
        }
        System.out.println(); // Para que la salida quede en una linea nueva
    }
}