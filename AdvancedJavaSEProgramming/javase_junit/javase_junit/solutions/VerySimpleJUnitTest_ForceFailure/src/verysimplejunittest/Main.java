/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package verysimplejunittest;

import junit.framework.TestCase;

// Extend the TestCase class
public class Main extends TestCase {

    // Test method
    public void testSomething1() {
        System.out.println("In testSomething1() method...");
        assertTrue("Tesing if  4 == (2 * 2)", 4 == (2 * 2));
    }

    // Test method
    public void testSomething2() {
        System.out.println("In testSomething2() method...");
        String s1 = "test1";
        String s2 = "test1";
        String s3 = new String(s1);
        assertTrue("Testing if two String instancesa are equal", s1.equals(s2));
        assertTrue(!(s1==s3));
    }

    // Test method
    public void testSomething3() {
        System.out.println("In testSomething2() method...");
        fail("I want to force failure on this test");
    }

    // main method to allow standalone execution
    public static void main(String[] args){
        junit.textui.TestRunner.run(Main.class);
    }
}
