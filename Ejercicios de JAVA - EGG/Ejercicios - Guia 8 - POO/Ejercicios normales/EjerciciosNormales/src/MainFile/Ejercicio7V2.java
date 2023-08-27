
package MainFile;

//  @author new53

import Servicios.ServicioPersona2;

public class Ejercicio7V2 {

    public static void main(String[] args) {
        ServicioPersona2[] vectorPersonas = new ServicioPersona2[4];
        for(int i=0; i<vectorPersonas.length; i++){
            System.out.println("Persona " + (i+1));
            vectorPersonas[i] = new ServicioPersona2(); // se crean cuatro objetos de la clase Persona usando el constructor de la clase servicio
            System.out.println("");
        }
        //Corroboramos pesos de c/u de las personas y si son mayores de edad
        for (ServicioPersona2 vectorPersona : vectorPersonas) {
            System.out.println("¿Se encuentra en el peso ideal la persona? " + vectorPersona.calcularIMC() + " - ¿Es mayor de edad?: " + vectorPersona.esMayorDeEdad());
        }
        System.out.println("");
        /*Calculamos porcentaje de personas que están por debajo de su peso
        y cuantas en su peso ideal, así mismo, calculamos el porcentaje de mayores
        y menores de edad
        */
        int mayores = 0;
        int pesoIdeal = 0;       
        for(ServicioPersona2 i : vectorPersonas){
            if(i.esMayorDeEdad()){
                mayores += 1;
            }
            if(i.calcularIMC() == 0){
                pesoIdeal += 1;
            }
        }             
        System.out.println("Porcentaje de personas en peso ideal: " + ((double)pesoIdeal/vectorPersonas.length)*100);
        System.out.println("Porcentaje de personas en peso no ideal: " + ((double)(vectorPersonas.length-pesoIdeal)/vectorPersonas.length)*100);
        System.out.println("Porcentaje de personas mayores: " + ((double)mayores/vectorPersonas.length)*100);
        System.out.println("Porcentaje de personas menores: " + ((double)(vectorPersonas.length-mayores)/vectorPersonas.length)*100);
    }
}