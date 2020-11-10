package pt.ual.bank.controllers;

import pt.ual.bank.models.Client;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients;

    public Bank() {
        this.clients = new ArrayList<>();
    }

    public boolean hasClientByIdNumber(String idNumber, String idType) {
        for (Client client : clients) {
            if(client.getIdNumber().equalsIgnoreCase(idNumber) &&
                    client.getIdType().equalsIgnoreCase(idType)) {
                return true;
            }
        }
        return false;
    }

    public String registerClient(String name, String idNumber, String idtype, String birthday, String address, String email, String phoneNumber) {
        return null;
    }

    public boolean hasClient(String clientId) {
        return false;
    }

    public void updateClient(String clientId, String name, String birthday, String address, String email, String phoneNumber) {
    }

    public String openAccount(String clientId, double initialDepositAmount) {
        return null;
    }
}
