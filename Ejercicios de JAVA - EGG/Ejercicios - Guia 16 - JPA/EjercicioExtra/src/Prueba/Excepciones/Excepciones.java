
package Prueba.Excepciones;


// @author new53
 
public class Excepciones {
    
    public static class UsuarioRepetido extends Exception{

        public UsuarioRepetido() {
        }

        public UsuarioRepetido(String string) {
            super(string);
        }       
    }

}
