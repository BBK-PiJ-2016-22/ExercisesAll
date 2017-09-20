package exercise1;

import java.net.MalformedURLException;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Casper on 14/12/2016.
 */

public class EchoClientLauncher {

    public static void main(String[] args) {
        EchoClientLauncher e = new EchoClientLauncher();
        e.sendEchoToServer();
    }

    public void sendEchoToServer(){

        try {
            String registryAdress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAdress + ":1099/echo");
            EchoService echoService = (EchoService) service;
            String receivedEcho = echoService.echo("Hello!");
            System.out.println(receivedEcho);



        } catch(NotBoundException ex) {
            System.out.println("Not bound");

        } catch (RemoteException ex){
            System.out.println("Remote");


        } catch (MalformedURLException ex){
            System.out.println("Malformed Url");

        }

    }
}
