import java.rmi.*;

/**
 * Remote Interface
 */
public interface HelloInterface extends Remote {

    public String sayHello(String name, Address address) throws RemoteException;
}