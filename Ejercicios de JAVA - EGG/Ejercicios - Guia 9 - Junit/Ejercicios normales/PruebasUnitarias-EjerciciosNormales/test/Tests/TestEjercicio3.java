/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Entidad.PasswordValidator;
import Servicio.PasswordService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author new53
 */
public class TestEjercicio3 {
    private static PasswordService pass1;
    private static PasswordService pass2;
    private static PasswordService pass3;
    
    public TestEjercicio3() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        pass1 = new PasswordService(new PasswordValidator("alejo1234"));
        pass2 = new PasswordService(new PasswordValidator("alejoñ1234"));
        pass3 = new PasswordService(new PasswordValidator("alejo1234*"));
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void firstPassInvalidate(){
        assertFalse(pass1.validPass());
        System.out.println("Return value: " + pass1.validPass());
    }
    
    @Test
    public void secondPassInvalidate(){
        assertFalse(pass2.validPass());
        System.out.println("Return value: " + pass2.validPass());
    }
    
    @Test
    public void thirdPassValidate(){
        assertTrue(pass3.validPass());
        System.out.println("Return value: " + pass3.validPass());
    }  
}