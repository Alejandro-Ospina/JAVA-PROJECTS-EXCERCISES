
package Servicio;

import Entidad.PasswordValidator;


// @author new53
 
public class PasswordService {
    private PasswordValidator password;
    private final String specialCaracter = "!¡#$%&+*._-";
    private final String numbers = "123456789";
    private final String invalidCaracter = "()?ñ[]{}";

    public PasswordService(PasswordValidator password) {
        this.password = password;
    }
    
    public boolean validPass(){
        boolean invalidC = false;
        boolean specialC = false;
        boolean number = false;
        if(password.getPassword().length() >= 8){
            for(String i : invalidCaracter.split("")){
                if(password.getPassword().contains(i)){
                    invalidC = true;
                    break;
                }
            }
            for(String i : specialCaracter.split("")){
                if(password.getPassword().contains(i)){
                    specialC = true;
                    break;
                }
            }
            for(String i : numbers.split("")){
                if(password.getPassword().contains(i)){
                    number = true;
                    break;
                }
            }
            if(specialC && !invalidC && number){
                return true;
            }
        }
        return false;
    }
}