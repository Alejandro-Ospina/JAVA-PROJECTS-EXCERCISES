
package MainFile;

//  @author new53

import Entidad.Persona;
import Servicios.ServicioPersona;

public class Ejercicio7 {

    public static void main(String[] args) {
        ServicioPersona persona = new ServicioPersona();
        Persona[] vectorPersonas = new Persona[4];
        for(int i=0; i<vectorPersonas.length; i++){
            System.out.println("Objeto" + (i+1));
            vectorPersonas[i] = persona.crearPersona(); // Se crean 4 objetos de tipo persona
            System.out.println("");
        }       
        //Corroboramos pesos de c/u de las personas y si son mayores de edad
        for (Persona vectorPersona : vectorPersonas) {
            System.out.println("¿Se encuentra en el peso ideal la persona? " + persona.calcularIMC(vectorPersona) + " - ¿Es mayor de edad?: " + persona.esMayorDeEdad(vectorPersona));
        }
        System.out.println("");
        /*Calculamos porcentaje de personas que están por debajo de su peso
        y cuantas en su peso ideal, así mismo, calculamos el porcentaje de mayores
        y menores de edad
        */        
        int mayores = 0;
        int pesoIdeal = 0;       
        for(Persona i : vectorPersonas){
            if(persona.esMayorDeEdad(i)){
                mayores += 1;
            }
            if(persona.calcularIMC(i) == 0){
                pesoIdeal += 1;
            }
        }             
        System.out.println("Porcentaje de personas en peso ideal: " + ((double)pesoIdeal/vectorPersonas.length)*100);
        System.out.println("Porcentaje de personas en peso no ideal: " + ((double)(vectorPersonas.length-pesoIdeal)/vectorPersonas.length)*100);
        System.out.println("Porcentaje de personas mayores: " + ((double)mayores/vectorPersonas.length)*100);
        System.out.println("Porcentaje de personas menores: " + ((double)(vectorPersonas.length-mayores)/vectorPersonas.length)*100);        
    }
}
