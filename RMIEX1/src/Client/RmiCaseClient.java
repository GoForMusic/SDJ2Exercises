package Client;

import Server.TextConverter;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class RmiCaseClient {
    private TextConverter serverStub;

    public RmiCaseClient()
    {
        try {
            serverStub= (TextConverter) Naming.lookup("rmi://localhost:1099/Case");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public String convert(String text, boolean upper) throws RemoteException
    {
        if(upper)
        {
            return serverStub.toUpperCase(text);
        }
        return serverStub.capitalize(text);
    }
}
