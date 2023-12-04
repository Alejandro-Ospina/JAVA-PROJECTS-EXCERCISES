
package com.Alejandro.EggNewsLoginUsers.Exceptions;


// @author new53
 
public class Excepciones {
    
    /**
     * La clase maneja una expeción de registro existente en la base de datos.
     */
    public static class RegistroExistente extends Exception{
        
        /**
         * La excepción se lanza cuando se persiste un registro que ya
         * existe en la base de datos.
         * @param string
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
         * @param string
         */
        public CamposVaciosONulos(String string) {
            super(string);
        }
    }
    
    /**
     * Esta clase maneja una excepción de registros no encontrados en base de 
     * datos.
     */
    public static class RegistroNoExistente extends Exception{
        
        /**
         * Esta excepción se lanza cuando no se encuentra un registro asociado en 
         * la base de datos.
         * @param string 
         */
        public RegistroNoExistente(String string) {
            super(string);
        }
        
    }
    
    /**
     * La clase maneja una excepción de desbordamiento de variables.
     */
    public static class ExceededSize extends Exception{
        /**
         * La excepción se lanza si se excede el tamaño de la variable.
         * @param string 
         */
        public ExceededSize(String string) {
            super(string);
        }
    }
}