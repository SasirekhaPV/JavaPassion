
import junit.framework.*;

public class TestComputeClass extends TestCase {

    public TestComputeClass(String name) {
        super(name);
    }
    // Initialize common test data
    int x;
    int y;

    protected void setUp() {
        System.out.println("setUp - Intialize common test data");
        x = 7;
        y = 5;
    }

    protected void tearDown() {
        System.out.println("tearDown - Clean up");
    }

    /**
     * Test of add method, of class ComputeClass.
     */
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
    public void testSubtract() {
        System.out.println("subtract");

        ComputeClass instance = new ComputeClass();

        int expResult = 2;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);

    }

    public void testDivideByZero() {
        System.out.println("divideByZero");
        
        try {
            ComputeClass instance = new ComputeClass();
            instance.divide(4, 0);
            // If ArithmeticException has not occurred, it is a failure
            fail("No exception on Divide by 0");
        } catch (ArithmeticException e) {
        }
    }

    public static void main(String[] args) {

        System.out.println("Running the test using junit.textui.TestRunner.run() method...");
        junit.textui.TestRunner.run(TestComputeClass.class);

    }
}
