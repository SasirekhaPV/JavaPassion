/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author sang
 */
public class ComputeClassTest extends TestCase {

    public ComputeClassTest(String testName) {
        super(testName);
    }
    int x;
    int y;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        x = 7;
        y = 5;
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of add method, of class ComputeClass.
     */
    public void testAdd() {
        System.out.println("add");
        //int x = 7;
        //int y = 5;
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
    public void testMultiply() {
        System.out.println("multiply");
        //int x = 7;
        //int y = 5;
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
    public void testSubtract() {
        System.out.println("subtract");
        //int x = 7;
        //int y = 5;
        ComputeClass instance = new ComputeClass();
        int expResult = 2;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }
}
