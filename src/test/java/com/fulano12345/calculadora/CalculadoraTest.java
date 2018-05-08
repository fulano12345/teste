/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fulano12345.calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Test
    public void testSomar() {
        System.out.println("somar");
        double num1 = 0.0;
        double num2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.somar(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSomarValorMaiorQueZero() {
        System.out.println("somar");
        double num1 = 2.0;
        double num2 = 1.0;
        Calculadora calc = new Calculadora();
        double expResult = 3.0;
        double result = calc.somar(num1, num2);
        assertEquals(expResult, result,0.0);
    
    }
}
