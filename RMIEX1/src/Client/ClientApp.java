package Client;

import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws RemoteException
    {
        if(System.getSecurityManager()==null)
        {
            System.setSecurityManager(new SecurityManager());
        }


        RmiCaseClient client = new RmiCaseClient();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to convert to uppercase: ");
        String line = input.nextLine();
        String convertLine = client.convert(line,true);
        System.out.println("Uppercase version: " + convertLine);
        System.out.println("Enter a string to capitalize first letter: ");
        line = input.nextLine();
        convertLine = client.convert(line,false);
        System.out.println("Capitalize version : " + convertLine);
    }
}
