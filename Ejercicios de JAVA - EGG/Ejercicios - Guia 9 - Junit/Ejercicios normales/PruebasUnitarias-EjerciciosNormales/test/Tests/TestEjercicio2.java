/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Entidad.TemperatureConverter;
import Servicio.TemperatureService;
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
public class TestEjercicio2 {
    private static TemperatureService converter;
    
    public TestEjercicio2() {
    }
    
    @BeforeClass
    public static void setUpClass() {        
        converter = new TemperatureService(new TemperatureConverter(10,10,10));
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
    public void celsiusFahrenheitConvertion(){
        assertEquals(50, converter.celsiusToFahrenheit(), 0);
        System.out.println("10°C to fahrenheit is: " + converter.celsiusToFahrenheit());
    }
    
    @Test
    public void celsiusKelvinConvertion(){
        assertEquals(283.15, converter.celsiusToKelvin(), 0);
        System.out.println("10°C to Kelvin is: " + converter.celsiusToKelvin());
    } 
    
    @Test
    public void fahrenheitCelsiusConvertion(){
        assertEquals(-12.2222, converter.fahrenheitToCelsius(), 0.1);
        System.out.println("10°F to celsius is: " + converter.fahrenheitToCelsius());
    }  
}