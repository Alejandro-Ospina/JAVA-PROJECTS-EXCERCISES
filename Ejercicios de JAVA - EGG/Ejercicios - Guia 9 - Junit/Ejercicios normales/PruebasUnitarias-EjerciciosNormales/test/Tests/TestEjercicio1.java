/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Entidad.DiscountCalculator;
import Servicio.DiscountCalculatorService;
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
public class TestEjercicio1 {
    private static DiscountCalculator objetoDescuento1;
    private static DiscountCalculator objetoDescuento2;
    private static DiscountCalculator objetoDescuento3;   
    
    public TestEjercicio1() {
    }
    
    @BeforeClass
    public static void setUpClass() {    
        objetoDescuento1 = new DiscountCalculator(100,10);
        objetoDescuento2 = new DiscountCalculator(100,50);
        objetoDescuento3 = new DiscountCalculator(100,0);
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
    public void aplicarDescuentoDiezPorciento(){
        System.out.println("con 10% de descuento: " + 
                DiscountCalculatorService.discount(objetoDescuento1));
        assertEquals(90, DiscountCalculatorService.discount(objetoDescuento1), 0);        
    }
    
    @Test
    public void aplicarDescuentoMaximo(){
        System.out.println("Con descuento máximo: " + 
                DiscountCalculatorService.discount(objetoDescuento2)); 
        assertEquals(50, DiscountCalculatorService.discount(objetoDescuento2), 0);             
    }
    
    @Test
    public void aplicarCeroDescuento(){
        System.out.println("Sin descuento: " + 
                DiscountCalculatorService.discount(objetoDescuento3)); 
        assertEquals(100, DiscountCalculatorService.discount(objetoDescuento3), 0);              
    }   
}