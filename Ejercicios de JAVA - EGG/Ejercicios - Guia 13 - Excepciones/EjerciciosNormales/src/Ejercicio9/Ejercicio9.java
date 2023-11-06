
package Ejercicio9;

//  @author new53
public class Ejercicio9 {

    public static void main(String[] args) {
        System.out.println("class C {\n" +
            "void metodoC() throws TuException{\n" +
            "sentencia_c1\n" +
            "try {\n" +
            "sentencia_c2\n" +
            "sentencia_c3\n" +
            "} catch (MioException e){\n" +
            "\n" +
            "13\n" +
            "\n" +
            "sentencia_c4\n" +
            "} catch (TuException e){\n" +
            "sentencia_c5\n" +
            "throw (e)\n" +
            "}\n" +
            "finally\n" +
            "sentencia_c6\n" +
            "\n" +
            "}\n" +
            "}");
        System.out.println("\na) Si se produce la excepción MioException se ejecutan"
                + "\nlas siguientes acciones en el orden dado: sentencia_c4 y sentencia_c6");
        System.out.println("\nb) Si no se produce la excepción MioException se ejecutan"
                + "\nlas siguientes acciones en el orden dado: sentencia_c2, sentenciac3"
                + "\ny sentencia_c6");
        System.out.println("\nc) Si se produce la excepción TuException se ejecutan"
                + "\nlas siguientes acciones en el orden dado: sentencia_c5, se arroja el objeto"
                + "\nde la excepción para que otro try-catch lo tome, y finalmente la sentencia_c6");
    }
}