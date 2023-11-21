
package com.alejandro.EggNews.Exceptions;


// @author new53
 
public class Excepciones {
    
    /**
     * La clase maneja una expeción de registro existente en la base de datos.
     */
    public static class RegistroExistente extends Exception{
        
        /**
         * La excepción se lanza cuando se persiste un registro que ya
         * existe en la base de datos.
         * @param mensaje_de_error 
         */
        public RegistroExistente(String string) {
            super(string);
        }      
    }
    
    /**
     * La clase maneja una excepción de campos vacíos o nulos.
     */
    public static class CamposVaciosONulos extends Exception{
        
        /**
         * La excepeción se arroja cuando los campos de un parámetro son vacíos
         * o nulos.
         * @param mensaje_de_error 
         */
        public CamposVaciosONulos(String string) {
            super(string);
        }
    }
}