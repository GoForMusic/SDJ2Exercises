package Server;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerApp {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        startRegistry();
        RmiCaseServer server = new RmiCaseServer();
        server.start();
        System.out.println("Server started...");
    }

    private static void startRegistry() throws RemoteException {
        try{
            Registry reg = LocateRegistry.createRegistry(1099);
            System.out.println("Registry started...");
        }catch (java.rmi.server.ExportException e)
        {
            System.out.println("Registry already started?" + e.getMessage());
        }
    }
}
