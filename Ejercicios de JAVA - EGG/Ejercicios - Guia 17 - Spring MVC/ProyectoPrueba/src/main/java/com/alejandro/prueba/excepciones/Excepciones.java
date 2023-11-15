
package com.alejandro.prueba.excepciones;


// @author new53
 
public class Excepciones {
    
    /**
     * Esta excepción se lanza cuando se presenta un inconveniente en la persistencia
     * de un libro.
     */
    public static class LibroNoCreado extends Exception {
        
        /**
        * Esta excepción se lanza cuando se presenta un inconveniente en la persistencia
        * de un libro.
         * @param string mensaje de error
        */
        public LibroNoCreado(String string) {
            super(string);
        }
    }
    
    /**
     * Esta excepción se lanza cuando no se encuentra un libro.
     */
    public static class EntidadNoEncontrada extends Exception{
        /**
         * Esta excepción se lanza cuando no se encuentra el registro de una entidad.
         * @param string mensaje de error
        */
        public EntidadNoEncontrada(String string) {
            super(string);
        }        
    }
    
    /**
     * Esta excepción se lanza cuando los campos están vacios.
     */
    public static class CamposVacios extends Exception{
        
        /**
        * Esta excepción se lanza cuando los campos están vacios.
         * @param string mensaje de error
        */
        public CamposVacios(String string) {
            super(string);
        } 
    }
    
    /**
     * Esta excepción se lanza si se encuentra un registro existente en la base de datos.
     */
    public static class RegistroExistente extends Exception{
        
        /**
        * Esta excepción se lanza si se encuentra un registro existente en la base de datos.
         * @param string mensaje de excepción.
        */
        public RegistroExistente(String string) {
            super(string);
        }   
    }
}