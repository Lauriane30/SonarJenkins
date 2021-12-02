package com.example.demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VirtualMachine
 */
public class DemoApplicationTests {
    
    public DemoApplicationTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of main method, of class CalculatriceJenkins.
     */
    
    @Test
    public void testAjouter() {
        // données d'entrées
        DemoApplication calc = new DemoApplication(4, 5);
        // résultat attendu
        int resultatAttendu = 9;
        // résultat effectif
        int resultatEffectif = calc.ajouter();
        // vérification
        assertEquals(resultatAttendu, resultatEffectif);
    }
    
    @Test
    public void testSoustraire() {
        // données d'entrées
        DemoApplication calc = new DemoApplication(5, 4);
        // résultat attendu
        int resultatAttendu = 1;
        // résultat effectif
        int resultatEffectif = calc.soustraire();
        // vérification
        assertEquals(resultatAttendu, resultatEffectif);
    }
    
    @Test
    public void testMultiplier() {
        // données d'entrées
        DemoApplication calc = new DemoApplication(4, 5);
        // résultat attendu
        int resultatAttendu = 20;
        // résultat effectif
        int resultatEffectif = calc.multiplier();
        // vérification
        assertEquals(resultatAttendu, resultatEffectif);
    }
    
    @Test
    public void testDiviser() {
        // données d'entrées
        DemoApplication calc = new DemoApplication(20, 4);
        // résultat attendu
        int resultatAttendu = 5;
        // résultat effectif
        int resultatEffectif = calc.diviser();
        // vérification
        assertEquals(resultatAttendu, resultatEffectif);
    }
    
    //@Test
    /*public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatriceJenkins.main(args);
        assertTrue(true);
        // TODO review the generated test code anassertTfail("The test case is a prototype.");
    }*/
    
}

