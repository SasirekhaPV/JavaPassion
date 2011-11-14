import java.rmi.*;
import java.rmi.server.*;

/**
 * Remote implementation class
 */
public class HelloImpl 
        implements HelloInterface {

    public HelloImpl() {
    }

    public String sayHello(String name, Address address) 
           throws RemoteException {
        return "Hello " + name + "! " + 
              "Your zip code is " + address.getZip();
    }
}
