package Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class RmiServer extends UnicastRemoteObject implements RemoteMessageList{
    private ArrayList<String> messageList;

    public RmiServer() throws RemoteException {
        super();
        messageList = new ArrayList<>();
    }

    public void start() throws RemoteException, MalformedURLException
    {
        Naming.rebind("Message", this);
    }

    @Override
    public void addMessage(String message){
        System.out.println("Message added (" + message + ")");
        messageList.add(message);
    }
}
