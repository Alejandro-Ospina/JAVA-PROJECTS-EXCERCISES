
package Entidades;


// @author new53
 
public class Ahorcado {
    private String buscarPalabra[];
    private int letrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscarPalabra, int letrasEncontradas, int jugadasMaximas) {
        this.buscarPalabra = buscarPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getBuscarPalabra() {
        return buscarPalabra;
    }

    public void setBuscarPalabra(String[] buscarPalabra) {
        this.buscarPalabra = buscarPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }       
}
