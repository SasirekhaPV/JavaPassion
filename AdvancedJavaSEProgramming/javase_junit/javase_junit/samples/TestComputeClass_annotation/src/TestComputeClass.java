
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// In JUnit 4, you don't have to extend TestCase class anymore
public class TestComputeClass {

    // Initialize common test data
    int x;
    int y;

    // In JUnit 4, the setUp method can be arbitrary name
    // with @Before annotation
    @Before
    public void MySetUp() {
        System.out.println("setUp - Intialize common test data");
        x = 7;
        y = 5;
    }

    // In JUnit 4, the tearDown method can be arbitrary name
    // with @After annotation
    @After
    public void MyTearDown() {
        System.out.println("tearDown - Clean up");
    }

    // One time setup for the whole tests
    @BeforeClass
    public static void myBeforeClassMethod() {
        System.out.println("myBeforeClassMethod - Set things up once for all");
    }

    // One time teardown for the whole tests
    @AfterClass
    public static void myAfterClassMethod() {
        System.out.println("myBeforeClassMethod - Clean things up once for all");
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

    @Test(timeout = 5000)
    public void testLengthyOperation() {
    }

    @Ignore("Ignore this test for now")
    @Test
    public void testTheWhatSoEverSpecialFunctionality() {
    }

    // JUnit 4 no longer supports a UI-based TestRunner; this is left to the IDE 
    // developers. But there is still a command-line tool you can use to manually 
    // run tests. Just call the class org.junit.runner.JUnitCore and pass the 
    // (fully qualified) names of your test classes:
    // java -cp <junit-jar> org.junit.runner.JUnitCore TestComputingClass
    public static void main(String[] args) {

        System.out.println("Try java -cp build\\classes;<junit-jar> org.junit.runner.JUnitCore TestComputingClass at the application root");
        //junit.textui.TestRunner.run(TestComputeClass.class);

    }
}
