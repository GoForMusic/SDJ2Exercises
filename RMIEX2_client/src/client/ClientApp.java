package client;

import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws RemoteException {
        while (true) {
            RmiClient client = new RmiClient();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the message: ");
            String line = input.next();
            System.out.println(line);
            input.nextLine();
            client.send(line);
        }
    }
}