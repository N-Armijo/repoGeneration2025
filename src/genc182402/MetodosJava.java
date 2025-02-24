package genc182402;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MetodosJava {

    //metodo que trabaja con los metodos de la clase Math
    public static void llamadoMetodosMath(){
        double numero = 16;
        System.out.println("El numero con el que vamos a trabajar es : " + numero);
        //llamamos a la clase Math y accedemos a su metodo random
        System.out.println("Un numero al azar entre 0 y 1 es: " + Math.random());
        //LLamamamos a la clase Math y al metodo pow
        System.out.println("El 16 elevado a 2 es " + Math.pow(16, 2));

        //LLamamos a la clase Math y al metodo max
        System.out.println("Entre estos dos valores, el maximo es " + Math.max(numero, 20.0));
        //LLamamos a la clase Math y al metodo min
        System.out.println("Entre estos dos valores, el minimo es " + Math.min(5, numero));
    }

    //Metodo que llame a metodos para los String
//    String nombre = "Nuria";
//    boolean igual = nombre.equals("Nuria");
    public static void llamadoMetodosString(String nombreUno, String nombreDos){
        System.out.println("Hola, bienvenidos al programa " + nombreUno + " y " + nombreDos);
        //LLamamos al metodo .equals() para comparar entre Strings
        //System.out.println("Los nombres " + nombreUno + " y " + nombreDos + " son iguales? " + (nombreUno == nombreDos) ); //Son objetos, tienen ubicacion en memoria distinta, no deberia funcionar. Por eso deberiamos usar el metodo de la clase String para comparar
        System.out.println("Los nombres " + nombreUno + " y " + nombreDos + " son iguales? " + nombreUno.equals(nombreDos) );
        System.out.println("Los nombres " + nombreUno + " y " + nombreDos + " son iguales? " + nombreUno.equalsIgnoreCase(nombreDos) );

        //Lamamos al etodo .length() para conocer la longitd de un String
        System.out.println("Los nombres " + nombreUno + " y " + nombreDos + " suman una cantidad de " + (nombreUno+nombreDos).length() + " caracteres");

        //Llamado al metodo .upperCase() para convertir el String a mayusculas
        System.out.println("El primer nombre en mayuscula seria " + nombreUno.toUpperCase());
        //llamamos al metodo lowerCase() para "Convertir" el string en minuscula -> crea un string nuevo a partir del dado, no los transforma
        System.out.println("El primer nombre en minuscula seria " + nombreUno.toLowerCase());
    }
    //metodos que llame a metodos para trabajar con fchas
    public static void llamadoMetodosFechas(){
        //clase para almacenar fecha, inicializamos con fecha actual
        LocalDate hoy = LocalDate.now();
        System.out.println("La fecha de hoy: " + hoy);
//        LocalDate hoy = LocalDate.;//tambien hay otros metodos para comparar fechas mas actuales

        //PAra obtener el year
        System.out.println("El year es " + hoy.getYear());//PAra obtener el year
        System.out.println("El mes es " + hoy.getMonth());//PAra obtener el mes
        System.out.println("El year es " + hoy.getDayOfMonth());//PAra obtener eldia del mes
        System.out.println("El year es " + hoy.getDayOfWeek()); //trae el dia de la semana con palabras  *****VER CLASE ENUM
        //Para formatear de acuerdo al lugar donde vivo
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Convencion para no confundir es MM mayuscula para mes y no confundir con minues mm que es minuscula
        System.out.println("La fecha formateada de hoy: " + fechaFormateada.format(hoy));

        //Fragmento codigo instructor
        //System.out.println("El resultado de comparar el DayOfTheWeek con el String MONDAY " + ("MONDAY".equals(String.valueOf(fechaDeHoy.getDayOfWeek()))));
        //Llamamos al método .format() y al método ofPattern() de la clase DateTimeFormatter para formatear la fecha actual
        System.out.println("Formato de la fecha: (dd/MM/yyyy) " + hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    public static void main(String[] args) {
        llamadoMetodosMath();
        llamadoMetodosString("Mariano" ,"MARIANO");
        llamadoMetodosFechas();
    }

}
