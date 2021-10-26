package client;

import Server.RemoteMessageList;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class RmiClient {

    private RemoteMessageList serverStub;

    public RmiClient()
    {
        try {
            serverStub= (RemoteMessageList) Naming.lookup("rmi://localhost:1099/Message");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void send(String text) throws RemoteException {
        serverStub.addMessage(text);
    }
}
