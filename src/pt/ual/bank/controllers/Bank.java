package pt.ual.bank.controllers;

import pt.ual.bank.models.Client;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients;
    public static int clientIdCouting = 1;

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

    public String registerClient(String name, String idNumber, String idType, String birthday, String address, String email, String phoneNumber)
    {
        Client newClient = new Client();
        newClient.setClientId(Integer.toString(clientIdCouting));
        newClient.setName(name);
        newClient.setIdNumber(idNumber);
        newClient.setIdType(idType);
        newClient.setBirthday(birthday);
        newClient.setAddress(address);
        newClient.setEmail(email);
        newClient.setPhoneNumber(phoneNumber);

        clients.add(newClient);
        clientIdCouting++;
        return newClient.getClientId();
    }

    public boolean hasClient(String clientId) {
        for (Client client : clients) {
            if(client.getClientId().equalsIgnoreCase(clientId)){
                return true;
            }
        }
        return false;
    }

    public void updateClient(String clientId, String name, String birthday, String address, String email, String phoneNumber) {
        for (Client client : clients) {
            if(client.getClientId().equalsIgnoreCase(clientId)){
                client.setName(name);
                client.setBirthday(birthday);
                client.setAddress(address);
                client.setEmail(email);
                client.setPhoneNumber(phoneNumber);
                break;
            }
        }
    }

    public String openAccount(String clientId, double initialDepositAmount) {
        return null;
    }
}
