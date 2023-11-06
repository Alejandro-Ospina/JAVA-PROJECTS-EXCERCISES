
package Ejercicio6;

//  @author new53
public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("class A {\n" +
                            "public void metodoA() {\n" +
                            "sentencia_a1\n" +
                            "sentencia_a2\n" +
                            "try {\n" +
                            "sentencia_a3\n" +
                            "sentencia_a4\n" +
                            "} catch (MioException e){\n" +
                            "sentencia_a6\n" +
                            "}\n" +
                            "sentencia_a5\n" +
                            "}\n" +
                            "}");
        System.out.println("\na.) Dado el código anterior, si se ejecuta la excepción MioException"
                + "\nse ejecuta la sentencia_a6 y luego la sentencia_a5.");
        System.out.println("\na.) Dado el código anterior, si no ejecuta la excepción MioException"
                + "\nse ejecutan las siguientes secuencias ordenadas: sentencia_a3, sentencia_a4 y"
                + "\nsentencia_a5");
    }

}
