package Server;

import Client.RmiCaseClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiCaseServer extends UnicastRemoteObject implements TextConverter
{
    public RmiCaseServer() throws RemoteException
    {
        super();
    }


    public void start() throws RemoteException, MalformedURLException
    {
        Naming.rebind("Case", this);
    }



    @Override
    public String toUpperCase(String text) throws RemoteException {
        return  text.toUpperCase();
    }

    @Override
    public String capitalize(String text) throws RemoteException {
        return Character.toUpperCase(text.charAt(0)) + text.substring(1).toUpperCase();
    }
}