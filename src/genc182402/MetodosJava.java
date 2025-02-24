package genc182402;

public class MetodosJava {

    //metodo que trabaja con los metodos de la clase Math
    public static void llamadoMetodosMath(){
        double numero = 16;
        System.out.println("El numero con el que vamos a trbajar es : " + numero);
        //llamamos a la clase Math y accedemos a su metodo random
        System.out.println("Un numero al azar entre 0 y 1" + Math.random());
        //LLamamamos a la clase Math y al metodo pow
        System.out.println("El 16 elevado a 2 es " + Math.pow(16, 2));

        //LLamamos a la clase Math y al metodo max
        System.out.println("Entre estos dos valores, el maximo es " + Math.max(numero, 20.0));
        //LLamamos a la clase Math y al metodo min
        System.out.println("Entre estos dos valores, el minimo es " + Math.min(5, numero));
    }

    public static void main(String[] args) {
        llamadoMetodosMath();
    }

}
