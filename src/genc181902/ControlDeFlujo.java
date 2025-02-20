package genc181902;

import java.util.Scanner;

public class ControlDeFlujo {
    //Control de flujo hace referencia a las condiciones que permiten controlar el flujo de decisiones del programa
    public static void main(String[] args) {
        //If equivale a un "Si" ...
        //Else if equivale a decir "O si" ...
        //Else equivale a decir "Si no" ...

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Traes tu carnet? (S/N): ");
        String respuestaCarnet = teclado.nextLine();

        //verificar si la edad de a persona cumple con ciertos requisistos para poder entrar
        //Mi condicion inicial

        if ((edad > 18) && (respuestaCarnet.equalsIgnoreCase("S"))) {
            if (nombre.equalsIgnoreCase("Toffee")){
                System.out.println("Denegado, "+ nombre +" No puedes pasar XD.");
            }else{
            System.out.println("Perfecto, "+ nombre +" puedes pasar. Diviértete!");
            }
        }else if ((edad == 18) && !(respuestaCarnet.equalsIgnoreCase("N"))) {
            System.out.println("Estas en la edad justa "+ nombre +", puedes pasar, pero te debes portar bien.");
        }else{
            //Este bloque de codigo se va a ejecutar en caso de que todo los demas resulte falso
            if (respuestaCarnet.equalsIgnoreCase("N")){
                System.out.println("Lo siento, "+nombre + ". Necesitas traer tu carnet para entrar.");
            }else{
            System.out.println("Lo sentimos, "+ nombre +", todavía no.");
            }
        }
        //Por buena practica y uso de memoria, cerrar el scanner!!!!!!!
        //teclado.close();


        System.out.println("""
                Que dia de la semana es?. Elige una opcion
                1. Lunes
                2. Martes
                3. Miercoles
                4. Jueves
                5. Viernes
                6. Sabado
                7. Domingo
                """);
        String diaSemana = teclado.nextLine(); //es distinto a int , al ser una clase, supongo tiene metodos
        //teclado.nextLine(); //limpiar buffer

        switch (diaSemana.toLowerCase()) {
            case "norma":
                System.out.println("Hoy es lunes, aun falta para el fin de semana. Animo!");
                break;
            case "nadia":
                System.out.println("Hoy es martes, aun falta para el fin de semana. Animo!");
                break;
            case "nicole":
                System.out.println("Hoy es miercoles");
                break;
            case "natalia":
                System.out.println("Hoy es jueves");
                break;
            case "nelson":
                System.out.println("Hoy es viernes y el cuerpo lo sabe");
                break;
            case "mireya":
                System.out.println("Hoy es sabado");
                break;
            case "enrique":
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("No es una opcion valida!");
        }
    }
}
