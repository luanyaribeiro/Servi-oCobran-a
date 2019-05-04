package main.java.Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CobrancaService extends UnicastRemoteObject implements ICobrancaService {

    public CobrancaService() throws RemoteException {
        super();
    }

    @Override
    public String emailCobrancaServico(String emailCobranca, String mensagemCobranca) throws RemoteException {

        System.out.println("Email " + emailCobranca);
        System.out.println("Mensagem: " + mensagemCobranca);

        return "Obrança efetuada com sucesso!";
    }
}
