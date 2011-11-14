
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestComputeClass2 {

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
    
    // Testing methods of ComputeClass2 class
     @Test
    public void testAddPlusOne() {
        System.out.println("addPlusOne");

        ComputeClass2 instance = new ComputeClass2();

        int expResult = 13;
        int result = instance.addPlusOne(x, y);
        assertEquals(expResult, result);

    }   
    
    @Test
    public void testSubtractPlusOne() {
        System.out.println("subtractPlusOne");

        ComputeClass2 instance = new ComputeClass2();

        int expResult = 3;
        int result = instance.subtractPlusOne(x, y);
        assertEquals(expResult, result);

    }

}
