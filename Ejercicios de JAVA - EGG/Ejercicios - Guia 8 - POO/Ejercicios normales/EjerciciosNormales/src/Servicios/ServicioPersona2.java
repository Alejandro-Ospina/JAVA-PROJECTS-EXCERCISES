
package Servicios;
import Entidad.Persona;
import java.util.Scanner;
// @author new53
public class ServicioPersona2 {
    private Scanner entrada = new Scanner(System.in);
    private Persona persona = new Persona();
    
    public ServicioPersona2(){
        crearPersona();
    }
    
    private void crearPersona(){
        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(entrada.nextLine());
        System.out.print("Ingrese la edad de la persona: ");
        persona.setEdad(entrada.nextInt());
        System.out.print("Ingrese el sexo de la persona: ");
        entrada.nextLine();        
        do{
            persona.setSexo(entrada.nextLine());
            if(!persona.getSexo().equalsIgnoreCase("h") && !persona.getSexo().equalsIgnoreCase("m") && !persona.getSexo().equalsIgnoreCase("o")){
                System.out.print("¡Sexo inválido!, ingrese nuevamente el sexo: ");
            }
        }while(!persona.getSexo().equalsIgnoreCase("h") && !persona.getSexo().equalsIgnoreCase("m") && !persona.getSexo().equalsIgnoreCase("o"));
        System.out.print("Ingrese la altura (m): ");
        persona.setAltura(entrada.nextDouble());
        System.out.print("Ingrese el peso (Kg): ");
        persona.setPeso(entrada.nextDouble());
        entrada.nextLine();
    }
    
    public int calcularIMC(){
        if((double) (persona.getPeso()/(persona.getAltura()*persona.getAltura())) < 20){
            return -1;
        }else if((double) (persona.getPeso()/(persona.getAltura()*persona.getAltura())) >= 20 && (double) (persona.getPeso()/(persona.getAltura()*persona.getAltura())) <= 25){
            return 0;            
        }else if((double) (persona.getPeso()/(persona.getAltura()*persona.getAltura())) > 25){
            return 1;
        }
        return 2;
    }
    
    public boolean esMayorDeEdad(){
        return persona.getEdad() >= 18 ? true : false;
    }
}