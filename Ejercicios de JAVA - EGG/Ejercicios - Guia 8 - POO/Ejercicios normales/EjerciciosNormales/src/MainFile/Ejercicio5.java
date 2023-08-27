
package MainFile;

//  @author new53

import Entidad.CuentaBancaria;
import Servicios.ServicioCuentaBancaria;

public class Ejercicio5 {

    public static void main(String[] args) {
        ServicioCuentaBancaria usuario = new ServicioCuentaBancaria();
        CuentaBancaria objetoUsuario = usuario.cuenta();
        usuario.ingresarDinero(objetoUsuario, 100000);
        usuario.retirarDinero(objetoUsuario, 500);
        usuario.extraccionRapida(objetoUsuario);
        System.out.println("Saldo Actual: " + usuario.consultarSaldo(objetoUsuario));
        usuario.consultarDatos(objetoUsuario);    
        usuario.extraccionRapida(objetoUsuario);
        usuario.consultarDatos(objetoUsuario);  
    }
}
