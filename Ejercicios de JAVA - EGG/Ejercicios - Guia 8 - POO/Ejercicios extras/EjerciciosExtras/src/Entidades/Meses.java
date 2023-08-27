
package Entidades;


// @author new53
 
public class Meses {
    private String mesSecreto;
    private final String mesesAnio[] = {"enero", "febrero", "marzo", "abril",
                                        "mayo", "junio", "julio", "agosto",
                                        "septiembre", "octubre", "noviembre", "diciembre"};

    public Meses() {
    }

    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMesesAnio() {
        return mesesAnio;
    }          
}