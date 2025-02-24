package genc182402;

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
    }

    public static void main(String[] args) {
        llamadoMetodosMath();
        llamadoMetodosString("Mariano" ,"MARIANO");
    }

}
