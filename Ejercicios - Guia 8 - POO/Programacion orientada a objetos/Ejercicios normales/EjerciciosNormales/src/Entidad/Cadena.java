
package Entidad;


// @author new53
 
public class Cadena {
    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setFraseLongitud(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
    }
    
    /**
     * Método que contabiliza vocales dentro de una frase (Si las hay).
     * @return número de vocales existentes en la frase.
     */
    public int mostrarVocales(){
        int numeroVocales = 0;
        for(String i : this.frase.split("")){
            if("a".equals(i) || "e".equals(i) || "i".equals(i) || "o".equals(i) || "u".equals(i)){
                numeroVocales += 1;
            }
        }
        return numeroVocales;
    }
    
    /**
     * Método que invierte la frase ingresada por parámetro a través del set \n
     * o el constructor con parámetro.
     * @return frase invertida
     */
    public String invertirFrase(){
        String fraseInvertida = "";
        for (int i=this.frase.split("").length-1; i>=0; i--){            
            fraseInvertida += this.frase.substring(i, i+1);                    
        }
        return fraseInvertida;
    }
    
    /**
     * Método que determina si un caracter se encuentra repetido, e imprime \n
     * la cantidad de veces que está repetido dicho caracter.
     * @param letra 
     */
    public void vecesRepetido(String letra){
        int seRepite = 0;
        for(String i : this.frase.split("")){
            if(letra.equals(i)){
                seRepite += 1;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + seRepite + " veces.");
    }
    
    /**
     * Método que imprime si una frase ingresada por el usuario tiene la misma \n
     * longitud del atributo "frase" de la clase Cadena.
     * @param frase 
     */
    public void compararLongitud(String frase){
        if(frase.length() == getLongitudFrase()){
            System.out.println("¡Las frases tienen longitud igual!");
        }else{
            System.out.println("¡Las frases NO tienen la misma longitud!");
        }
    }
    
    /**
     * Método que une una frase dada por el usuario con la frase del atributo
     * @param frase
     * @return frase concatenada
     */
    public String unirFrases(String frase){
        return this.frase.concat(frase);
    }
    
    /**
     * Método que reemplaza el caracter 'a' por un caracter definido por el usuario.
     * @param letra
     * @return frase modificada con el cambio de caracter
     */
    public String reemplazar(char letra){
        return this.frase.toLowerCase().replace('a', letra);
    }
    
    /** 
     * Método que comprueba si un caracter está contenido en el atributo frase
     * @param letra
     * @return true o false si el caracter está o no está contenido respectivamente.
     */
    public boolean contiene(String letra){
        return this.frase.toLowerCase().contains(letra) ? true : false;
    }
}