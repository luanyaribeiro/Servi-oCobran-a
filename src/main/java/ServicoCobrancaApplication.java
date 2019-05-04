package main.java;

import main.java.Service.CobrancaService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServicoCobrancaApplication {

    public static void main(String[] args){

        try {
            LocateRegistry.createRegistry(1099);
            CobrancaService servicoCobranca = new CobrancaService();
            Naming.rebind("//localhost/cobranca",servicoCobranca);
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
