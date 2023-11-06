
package libreria.servicios.exceptions;

import java.util.logging.Logger;


// @author new53
 
public class LibreriaExcepciones{

    /**
     * Excepción que se genera si no se puede añadir un objeto a cualquiera de las entidades
     * en la base de datos "libreria".
     */
    public static class EntidadNoCreada extends Exception{
        /**
         * Excepción que se genera si no se puede añadir un objeto a cualquiera de las entidades
         * en la base de datos "libreria".
         * @param string Mensaje de la excepción.
         */
        public EntidadNoCreada(String string) {
            super(string);
        }
        
    }
    
    /**
     * Excepción que se da si en la base de datos "libreria" no se encuentra un registro
     * de una entidad asociada.
     */
    public static class EntidadNoEncontrada extends Exception{
        /**
         * Excepción que se da si en la base de datos "libreria" no se encuentra un registro
         * de una entidad asociada.
         * @param string Mensaje de la excepción.
         */
        public EntidadNoEncontrada(String string) {
            super(string);
        }       
    }
    
    /**
     * Excepción que se genera cuando hay un problema en la consulta.
     */
    public static class ExcepcionBusqueda extends Exception{
        /**
         * Excepción que se genera cuando hay un problema en la consulta.
         * @param string 
         */
        public ExcepcionBusqueda(String string) {
            super(string);
        }
        
        /**
         * Excepción que se genera cuando hay un problema en la consulta, generada por
         * una causa.
         * @param string mensaje
         * @param causa causa
         */
        public ExcepcionBusqueda(String string, Throwable causa) {
            super(string, causa);
        }                
        
    }
}