/*
 * To change this template, choose Tools | Templates
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
 * @author sang
 */
public class ComputeClassTest {

    public ComputeClassTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class ComputeClass.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 7;
        int y = 5;
        ComputeClass instance = new ComputeClass();
        int expResult = 12;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class ComputeClass.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int x = 7;
        int y = 5;
        ComputeClass instance = new ComputeClass();
        int expResult = 35;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class ComputeClass.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int x = 7;
        int y = 5;
        ComputeClass instance = new ComputeClass();
        int expResult = 2;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}