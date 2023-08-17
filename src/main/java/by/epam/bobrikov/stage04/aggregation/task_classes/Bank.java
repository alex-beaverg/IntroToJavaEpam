package by.epam.bobrikov.stage04.aggregation.task_classes;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client findClient(String surname) {
        for (Client client: clients) {
            if (client.getSurname().equals(surname)) {
                return client;
            }
        }
        return null;
    }
}
