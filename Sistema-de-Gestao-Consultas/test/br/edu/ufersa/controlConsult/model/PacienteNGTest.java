/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.model;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author juan
 */
public class PacienteNGTest {
    
    public PacienteNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getNum_sus method, of class Paciente.
     */
    @Test
    public void testGetNum_sus() {
        System.out.println("getNum_sus");
        Paciente instance = null;
        String expResult = "";
        String result = instance.getNum_sus();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum_sus method, of class Paciente.
     */
    @Test
    public void testSetNum_sus() {
        System.out.println("setNum_sus");
        String num_sus = "";
        Paciente instance = null;
        instance.setNum_sus(num_sus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Paciente.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Paciente instance = null;
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Paciente.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Paciente instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPessoa method, of class Paciente.
     */
    @Test
    public void testGetPessoa() {
        System.out.println("getPessoa");
        Paciente instance = null;
        Pessoa expResult = null;
        Pessoa result = instance.getPessoa();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPessoa method, of class Paciente.
     */
    @Test
    public void testSetPessoa() {
        System.out.println("setPessoa");
        Pessoa pessoa = null;
        Paciente instance = null;
        instance.setPessoa(pessoa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Paciente.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Paciente instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Paciente.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Paciente instance = null;
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Paciente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Paciente instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
