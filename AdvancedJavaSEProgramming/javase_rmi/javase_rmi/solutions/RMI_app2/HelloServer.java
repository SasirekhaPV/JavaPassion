import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer {

    /**
     * Server program for the "Hello, world!" example.
     * @param argv The command line arguments which are ignored.
     */
    public static void main(String[] argv) {
        try {
            HelloImpl hello = new HelloImpl();
            HelloInterface stub =
                    (HelloInterface) UnicastRemoteObject.exportObject(hello, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Hello2", stub);
            //Naming.rebind("Hello2", new HelloImpl());
            System.out.println("Hello2 Server is ready.");
        } catch (Exception e) {
            System.out.println("Hello2 Server failed: " + e);
        }
    }
}
