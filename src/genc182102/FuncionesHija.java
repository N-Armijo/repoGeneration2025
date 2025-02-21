package genc182102;

public class FuncionesHija extends Funciones {
    public static void main(String[] args) {
        FuncionesHija funcion = new FuncionesHija();
        System.out.println(funcion.segundoApellido); //-> protected SOLO permite ser accedido desde la clase hija
    }
}
