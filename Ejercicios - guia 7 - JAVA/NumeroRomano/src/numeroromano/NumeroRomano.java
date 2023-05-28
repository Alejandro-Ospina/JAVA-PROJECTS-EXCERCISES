
package numeroromano;
import java.util.*;

//  @author new53
public class NumeroRomano {
    
    public static int transformarRomano(String numeroRomano){
        String[] entradaRomano = numeroRomano.split("");
        HashMap<Character, Integer> listaRomano = new HashMap<>();
        listaRomano.put('i', 1);
        listaRomano.put('v', 5);
        listaRomano.put('x', 10);
        listaRomano.put('l', 50);
        listaRomano.put('c', 100);
        listaRomano.put('d', 500);
        listaRomano.put('m', 1000);
        int numeroFinal = 0;        
        for(int i=0; i<entradaRomano.length; i++){            
            if(i<entradaRomano.length-1){
                if(listaRomano.get(numeroRomano.charAt(i)) < listaRomano.get(numeroRomano.charAt(i+1))){  
                    numeroFinal -= listaRomano.get(numeroRomano.charAt(i)); 
                }else{
                    numeroFinal += listaRomano.get(numeroRomano.charAt(i));
                }
            }else if(i==entradaRomano.length-1){
                numeroFinal += listaRomano.get(numeroRomano.charAt(i));
            }            
        }
        return numeroFinal;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el número romano: ");
        String romano = entrada.next().toLowerCase();
        System.out.println(romano.toUpperCase() + " representa el número: " + transformarRomano(romano));
    }

}
