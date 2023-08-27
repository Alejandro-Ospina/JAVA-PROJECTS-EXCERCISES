
package Servicios;

import Entidades.NIF;
import java.util.Scanner;


// @author new53
 
public class ServicioNIF {
    private Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    private NIF objeto;
        
    public ServicioNIF(){
        crearNIF();
    }
    
    /**
     * El método calcula el NIF cuando se ingresa un DNI de 8 dígitos.
     */
    private void crearNIF(){
        objeto = new NIF();
        System.out.print("Ingrese su DNI: ");
        String DNI;
        do{
            DNI = entrada.nextLine();
            if(DNI.length() != 8){
                System.out.print("¡DNI debe tener longitud de máximo 8 números!"
                        + "\nIntenta de nuevo: ");
            }
        }while(DNI.length() != 8);
        objeto.setDNI(Long.parseLong(DNI));
        String[][] nifVector = 
        {{"0","T"},{"1","R"},{"2","W"},{"3","A"},{"4","G"},{"5","M"},{"6","Y"},
         {"7","F"},{"8","P"},{"9","D"},{"10","X"},{"11","B"},{"12","N"},{"13","J"},
         {"14","Z"},{"15","S"},{"16","Q"},{"17","V"},{"18","H"},{"19","L"},{"20","C"},
         {"21","K"},{"22","E"}};
        for(int i=0; i<nifVector.length;i++){
            if(Long.toString(objeto.getDNI() % nifVector.length).equalsIgnoreCase(nifVector[i][0])){
                objeto.setNif(nifVector[i][1]);
                break;
            }
        }
    }
    
    /**
     * El método se encarga de retornar el DNI junto al NIF respectivo.
     * @return Devuelve un String con el DNI y el NIF asociado.
     */
    public String mostrar(){
        return Long.toString(objeto.getDNI()) + " - " + objeto.getNif();
    }
}