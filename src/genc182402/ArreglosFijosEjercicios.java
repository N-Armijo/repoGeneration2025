/*1. **Dados un arreglo de números y un arreglo de Strings, te corresponde llevar a cabo lo siguiente:
  a. En el arreglo de números:
- Obtener el máximo y el mínimo
- Contar elementos pares e impares dentro del arreglo
- Ordenar el arreglo en orden ascendente       0
- Buscar duplicados dentro del arreglo
b. En el arreglo de String:
- Contar las vocales de cada texto
- Ordenar alfabéticamente
- Encontrar el texto más largo
- Concatenar todos los textos sin usar +2.
**Ejecución y Pruebas:**
Ejecuta el programa y verifica lo solicitado mediante impresiones en consola.*/
package genc182402;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArreglosFijosEjercicios {
    // Arreglo de enteros
    int[] numeros = {10, 5, 20, 15, 25, 10, 30, 15, 5, 40};
    // Arreglo de String
    String[] mascotas = {"Perro", "Cabra", "Caballo", "Pez", "Gato", "Loro", "Araña", "Capibara", "Hamster", "Vaca", "Cocodrilo"};

    public static void main(String[] args) {
        ArreglosFijosEjercicios ejercicio = new ArreglosFijosEjercicios();
        ejercicio.procesarNumeros();
        ejercicio.procesarStrings();
    }

    public void procesarNumeros() {
        // Obtener el máximo y el mínimo
        int maximo = Arrays.stream(numeros).max().getAsInt();
        int minimo = Arrays.stream(numeros).min().getAsInt();
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);

        // Contar elementos pares e impares
        long pares = Arrays.stream(numeros).filter(n -> n % 2 == 0).count();
        System.out.println("Otra manera de filtrar los impares "+ Arrays.stream(numeros).filter( n -> n%2!=0).count());
        long impares = numeros.length - pares; //Al total del arreglo le resta la cantidad de numeros que resultaron ser pares
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);

        // Ordenar el arreglo en orden ascendente
        Arrays.sort(numeros); // -> Esto modifica el arreglo original?
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        // Buscar duplicados

        /*Forma 1*/
//        Map<Integer, Integer> frecuencia = new HashMap<>();
//        for (int num : numeros) {
//            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
//        }
//        System.out.println("Duplicados:");
//        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey() + " aparece " + entry.getValue() + " veces");
//            }
//        }
        /* Forma 2*/
        System.out.println("Numeros duplicados");
        ArrayList<Integer> duplicados = new ArrayList<>(); //ArrayList permite crear un arreglo vacio, pero el tipo de dato entre <> No puede ser tipo primitivo
        for ( int i = 0 ; i < numeros.length ; i++){
            for(int j = i+1; j < numeros.length; j++){
                if(numeros[i] == (numeros[j])){
                    duplicados.add(numeros[i]);
                    System.out.println("Numero que esta duplicado " + duplicados.get(duplicados.toArray().length-1));
                }
            }
        }
        System.out.println("Los numeros duplicados son : " + duplicados);
    }

    public void procesarStrings() {
        // Contar las vocales de cada texto
        for (String mascota : mascotas) {
            int contadorVocales = contarVocales(mascota);
            System.out.println("Vocales en '" + mascota + "': " + contadorVocales);
        }

        // Ordenar alfabéticamente
        Arrays.sort(mascotas);
        System.out.println("Arreglo ordenado alfabéticamente: " + Arrays.toString(mascotas));

        // Encontrar el texto más largo
        String masLargo = Arrays.stream(mascotas).max((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse("");
        System.out.println("Texto más largo: " + masLargo);

        // Concatenar todos los textos sin usar +
        StringBuilder concatenado = new StringBuilder();
        for (String mascota : mascotas) {
            concatenado.append(mascota);
        }
        System.out.println("Textos concatenados: " + concatenado.toString());
    }

    private int contarVocales(String texto) {
        return (int) texto.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}