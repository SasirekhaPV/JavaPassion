
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.AfterClass;
import org.junit.BeforeClass;

@RunWith(value=Suite.class)
@SuiteClasses(value={TestComputeClass.class, TestComputeClass2.class})
public class AllTests {
  
    // One time setup for the whole tests
    @BeforeClass
    public static void myBeforeClassMethod() {
        System.out.println("myBeforeClassMethod - Set things up once for all");
    }

    // One time teardown for the whole tests
    @AfterClass
    public static void myAfterClassMethod() {
        System.out.println("myAfterClassMethod - Clean things up once for all");
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
