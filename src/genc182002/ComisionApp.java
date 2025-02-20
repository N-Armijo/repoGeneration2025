package genc182002;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ComisionApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        do { //Ciclo infinito hasta que ingresa los datos solicitados correctamente
            try { //Probara las condicionales si se ingresan numeros
                System.out.println("Ingrese el valor de las ventas");
                double ventas = entrada.nextDouble();
                if (ventas >= 100000) {
                    System.out.println("La comision por ventas de $" + ventas + " es " + ventas * .3);
                    break;
                } else if ((ventas > 50000) && (ventas < 100000)) {
                    System.out.println("La comision por ventas de $" + ventas + " es " + ventas * .2);
                    break;
                } else if ((ventas >= 10000) && (ventas <= 50000)) {
                    System.out.println("La comision por ventas de $" + ventas + " es " + ventas * .1);
                    break;
                } else if ((ventas > 0) && (ventas < 10000)) {
                    System.out.println("Sin comision por ventas de $" + ventas);
                    break;
                }else{
                    System.out.println("Monto no valido"); // Si se ingresa un valor negativo, sera devuelto al bucle do, donde pregunta por un numero valido
                }
            } catch (InputMismatchException e) { //si se ingresa un valor distinto al esperado. Por ejemplo, espero un tipo double y el usuario ingresa una letra
                System.out.println("Entrada invalida: Debe ingresar un numero valido"); //En caso de ingresar un numero (por ejemplo una letra), arroja un error y no bota el programa (crashear). Esto devuelve al ciclo de do para que ingrese un numero
                entrada.next(); //Limpia la memoria de la variable (buffer), de lo contrario se entra a un buble infinito donde intenta leer el mismo valor no valido
            }
        }while (true); //Ciclo infinito. Se detiene con el break dentro de las condicionales, si se ingresaron datos validos
        entrada.close(); //cierra el scanner
    }
}
/*
** Dentro del proyecto, crea una nueva clase llamada `ComisionApp`
** Implementar Código de la Aplicación de Comisiones:
    - En la clase `ComisionApp`, escribe el código para calcular la comisión basándote en las ventas ingresadas por el usuario.
    - Pide al usuario que ingrese sus ventas.
    - Utiliza estructuras condicionales (**`if`**, **`else if`**, **`else`**) para evaluar las ventas y determinar la comisión según las siguientes condiciones:
        - "30%" para ventas superiores a $100,000.********
        - "20%" para ventas entre $50,001 y $90,999.***
        - "10%" para ventas entre $10,001 y $40,999.**
        - "N/A" (No aplica) para ventas inferiores a $10,000.**
**Imprimir Detalles de la Comisión:**
    - Modifica la salida para imprimir las ventas ingresadas y la comisión calculada.
**Manejo de Entrada Inválida:**
    - Agrega validación para manejar el caso en que el usuario ingrese ventas negativas o una entrada no válida.
    - Muestra mensajes indicando que la entrada es inválida en estos casos.
* */
