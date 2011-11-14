import java.rmi.*;

public class HelloClient {

    /**
     * Client program for the "Hello, world!" example.
     * @param argv The command line arguments which are ignored.
     */
    public static void main(String[] argv) {
        try {
            HelloInterface hello =
                    (HelloInterface) Naming.lookup("Hello2");
            String result = hello.sayHello("Sang Shin", 
                                      new Address("Newton", 45456));    
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("HelloClient exception: " + e);
        }
    }
}