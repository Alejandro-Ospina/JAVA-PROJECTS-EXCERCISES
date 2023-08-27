
package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;


// @author new53
 
public class ServicioAhorcado {
    private final Scanner entrada;
    private Ahorcado ahorcado;
    private String palabraOculta[];  
    
    public ServicioAhorcado(){
        this.entrada = new Scanner(System.in);
        this.ahorcado = crearJuego();
    }
    
    private Ahorcado crearJuego(){
        ahorcado = new Ahorcado();
        System.out.print("Ingrese la palabra del ahorcado: ");
        ahorcado.setBuscarPalabra(entrada.next().split(""));
        palabraOculta = new String[ahorcado.getBuscarPalabra().length];
        for(int i=0; i<palabraOculta.length; i++){
            palabraOculta[i] = " _ ";
        }
        System.out.print("Ingrese la cantidad máxima de intentos del juego: ");
        ahorcado.setJugadasMaximas(entrada.nextInt());
        ahorcado.setLetrasEncontradas(0);
        return ahorcado;
    }
    
    private void longitud(){
        System.out.println("Longitud de la palabra oculta: " + palabraOculta.length);
    }
    
    private void buscar(String letra){
        boolean comprobarLetra = false;
        boolean contieneLetra = false;
        for (String palabraOculta1 : palabraOculta) {
            if (palabraOculta1.equalsIgnoreCase(letra)) {
                contieneLetra = true;
            }
        }                
        for(int i=0; i<ahorcado.getBuscarPalabra().length; i++){
            if(ahorcado.getBuscarPalabra()[i].equalsIgnoreCase(letra)){
                palabraOculta[i] = ahorcado.getBuscarPalabra()[i];
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                comprobarLetra = true;
            }
        }               
        if(!comprobarLetra){
            System.out.println("¡Alerta! Letra no existente");
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas()-1);            
        }else if(contieneLetra){
            System.out.println("¡Alerta! Letra ingresada previamente");
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas()-1);
        }
        System.out.println("Palabra oculta: " + Arrays.toString(palabraOculta));       
    }
    
    private void encontradas(String letra){
        int contador = 0;
        boolean comprobarLetra = false;
        for(int i=0; i<palabraOculta.length; i++){
            if(palabraOculta[i].equalsIgnoreCase(ahorcado.getBuscarPalabra()[i])){
                contador ++;
            }
            if(palabraOculta[i].equalsIgnoreCase(letra)){
                comprobarLetra = true;
            }
        }
        System.out.println("Letras encontradas: " + contador + 
                "\nLetras que faltan por encontrar: " + (palabraOculta.length-contador));
        if(comprobarLetra){
            System.out.println("La letra '" + letra + "' ya se ha encontrado");
        }else{
            System.out.println("La letra '" + letra + "' no pertenece a la palabra");
        }
    }
    
    private void intentos(){
        System.out.println("Intentos restantes: " + ahorcado.getJugadasMaximas());
    }
    
    public void iniciarJuego(){
        System.out.println("\n¡Bienvenido(a) al juego del ahorcado!" +                 
                "\nNota: finalizarás el juego cuando descubras la palabra\n" + 
                "o agotes los intentos. ¡Buena suerte!\n");
        System.out.print("Ingresa una letra: ");
        String letra = "";
        do{
            letra = entrada.next();
            longitud();
            buscar(letra);
            encontradas(letra);
            intentos(); 
            System.out.println("");  
            if(ahorcado.getJugadasMaximas() != 0 &&
                    !Arrays.equals(palabraOculta, ahorcado.getBuscarPalabra())
                    ){
                System.out.print("ingrese una letra: ");
            }           
        }
        while(ahorcado.getJugadasMaximas() != 0 && !Arrays.equals(palabraOculta, ahorcado.getBuscarPalabra()));
        if(ahorcado.getJugadasMaximas() == 0 && !Arrays.equals(palabraOculta, ahorcado.getBuscarPalabra())){
            System.out.println("¡Has perdido! :(\n");
        }else if(Arrays.equals(palabraOculta, ahorcado.getBuscarPalabra())){
            System.out.println("¡GANASTE! :)\n");
        }
    }
}