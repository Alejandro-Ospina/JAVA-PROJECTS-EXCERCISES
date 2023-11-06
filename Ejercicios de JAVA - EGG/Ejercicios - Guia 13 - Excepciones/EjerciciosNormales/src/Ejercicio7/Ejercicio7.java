
package Ejercicio7;

//  @author new53
public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("class B {\n" +
            "public void metodoB() {\n" +
            "sentencia_b1\n" +
            "try {\n" +
            "sentencia_b2\n" +
            "} catch (MioException e){\n" +
            "sentencia_b3\n" +
            "}\n" +
            "finally\n" +
            "sentencia_b4\n" +
            "}\n" +
            "}");
        System.out.println("\na) Si se produce la excepción MioException, se ejecuta "
                + "\nla sentencia_b3, y luego la sentencia_b4");
        System.out.println("\nb) Si no se produce la excepción MioException, se ejecutan "
                + "\nlas siguientes secuencias en el orden dado: sentencia_b2 y sentencia_b4.");
    }

}
