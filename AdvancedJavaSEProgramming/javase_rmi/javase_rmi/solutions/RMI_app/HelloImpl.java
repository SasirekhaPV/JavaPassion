import java.rmi.*;
import java.rmi.server.*;

/**
 * Remote implementation class.  Because it extends the UnicastRemoteObject,
 * it is automatically exported.
 */
public class HelloImpl extends UnicastRemoteObject
        implements HelloInterface {

    public HelloImpl() throws RemoteException {
    }

    public String sayHello(String name) throws RemoteException {
        return "Hello " + name + "!";
    }
}
