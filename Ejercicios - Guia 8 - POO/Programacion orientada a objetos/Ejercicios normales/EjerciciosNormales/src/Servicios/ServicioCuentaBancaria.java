
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;


// @author new53
 
public class ServicioCuentaBancaria {
    private Scanner entrada = new Scanner(System.in);
    private int counter = 0;
    
    /**
     * Método que devuelve un objeto de la clase CuentaBancaria con atributos
     * definidos por el usuario.
     * @return 
     */
    public CuentaBancaria cuenta(){
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = entrada.nextInt();
        System.out.print("Ingrese el DNI: ");
        long numeroDNI = entrada.nextLong();
        System.out.print("Ingrese el saldo: ");
        int saldo = entrada.nextInt();
        return new CuentaBancaria(numeroCuenta, numeroDNI, saldo);
    }
    
    /**
     * Método que ingresa dinero a la cuenta bancaria.
     * @param saldo
     * @param dinero 
     */
    public void ingresarDinero(CuentaBancaria saldo, double dinero){
        saldo.setSaldoActual((int) (saldo.getSaldoActual() + dinero));
    }           
    
    /**
     * Método que hace el retiro del dinero y analiza las condiciones de retiro
     * según el saldo de la cuenta.
     * @param saldo
     * @param dinero 
     */
    public void retirarDinero(CuentaBancaria saldo, double dinero){
        if(dinero > saldo.getSaldoActual()){
            System.out.println("No existen los fondos solicitados, se retirará"
                    + " el total de cuenta");
            System.out.println("Retirando...");
            saldo.setSaldoActual(0);
            saldo.getSaldoActual();
        }else{
            System.out.println("Retirando...");
            saldo.setSaldoActual((int) (saldo.getSaldoActual() - dinero));           
        }      
    }
    
    /**
     * Método que realiza un retiro rápido de dinero equivalente al 20% del saldo \n
     * de la cuenta.\n
     * Nota: No se permiten retiros rápidos consecutivos.
     * @param saldo 
     */
    public void extraccionRapida(CuentaBancaria saldo){
        counter += 1;
        if(saldo.getSaldoActual() == 0){
            System.out.println("Fondos insuficientes, no se puede retirar dinero");
        }else if (counter == 1){
            System.out.println("Retiro rápido en proceso...");
            saldo.setSaldoActual((int) (saldo.getSaldoActual() - 0.2*saldo.getSaldoActual()));
        }else if (counter > 1){
            System.out.println("No se puede retirar más del 20%. Retiro inválido");
        }    
    }
    
    /**
     * Método que devuelve el saldo actual de la cuenta.
     * @param saldo
     * @return 
     */
    public int consultarSaldo(CuentaBancaria saldo){
        return saldo.getSaldoActual();
    }
    
    /**
     * Método que muestra por pantalla los datos actualizados de la cuenta \n
     * bancaria.
     * @param datos 
     */
    public void consultarDatos(CuentaBancaria datos){
        System.out.println(datos.toString());
    }
}