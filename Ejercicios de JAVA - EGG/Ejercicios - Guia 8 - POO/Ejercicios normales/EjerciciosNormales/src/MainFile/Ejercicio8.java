
package MainFile;

//  @author new53

import Entidad.Cadena;

public class Ejercicio8 {

    public static void main(String[] args) {
        Cadena cadena = new Cadena("Hola mundo cruel!");
        System.out.println("vocales: " + cadena.mostrarVocales());
        System.out.println("Frase invertida: " + cadena.invertirFrase());
        cadena.vecesRepetido("l");
        cadena.compararLongitud("Hola mundo cruel");
        System.out.println("Frases unidas: " + cadena.unirFrases("Alejandro"));
        System.out.println("Frase modificada: " + cadena.reemplazar('p'));
        System.out.println("¿Contiene caracter?: " + cadena.contiene("!"));        
    }
}
