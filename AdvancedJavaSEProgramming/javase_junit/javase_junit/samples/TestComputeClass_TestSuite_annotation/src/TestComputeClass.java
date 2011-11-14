
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestComputeClass {

    // Initialize common test data
    int x;
    int y;

    // In JUnit 4, the setUp method can be arbitrary name
    // with @Before annotation
    @Before
    public void MySetUp() {
        //System.out.println("setUp - Intialize common test data");
        x = 7;
        y = 5;
    }

    // In JUnit 4, the tearDown method can be arbitrary name
    // with @After annotation
    @After
    public void MyTearDown() {
        //System.out.println("tearDown - Clean up");
    }


    /**
     * Test of add method, of class ComputeClass.
     */
    // In JUnit 4, the test method can be arbitrary name
    // with @Test annotation
    @Test
    public void testAdd() {
        System.out.println("add");

        ComputeClass instance = new ComputeClass();

        int expResult = 12;
        int result = instance.add(x, y);
        assertEquals(expResult, result);

    }

    /**
     * Test of multiply method, of class ComputeClass.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");

        ComputeClass instance = new ComputeClass();

        int expResult = 35;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);

    }

    /**
     * Test of subtract method, of class ComputeClass.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");

        ComputeClass instance = new ComputeClass();

        int expResult = 2;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        System.out.println("divideByZero");

        ComputeClass instance = new ComputeClass();
        instance.divide(4, 0);

    }

    // Create a TestSuite - JUnit 3 style of creating TestSuite
//    public static Test createTestSuite() {
//        TestSuite testSuite = new TestSuite("AllTests");
//        testSuite.addTest(new TestComputeClass("testAdd"));
//        testSuite.addTest(new TestComputeClass("testMultiply"));
//        testSuite.addTest(new TestComputeClass("testSubtract"));
//        return testSuite;
//    }
    
}
