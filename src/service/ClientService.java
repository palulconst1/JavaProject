package service;

import model.*;
import java.util.*;

public class ClientService {
    private Set<Client> clients = new HashSet<Client>();
    public ClientService() {
        initializeClients();
    }
    public void displayClients()    {
        System.out.println(Arrays.toString(clients.toArray()));
    }
    private void initializeClients() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nr Clienti: ");
        int n = Integer.parseInt(myObj.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nume: ");
            String nume = myObj.nextLine();
            System.out.println("Prenume: ");
            String prenume = myObj.nextLine();
            System.out.println("varsta: ");
            int varsta = Integer.parseInt(myObj.nextLine());
            System.out.println("greutate: ");
            int greutate = Integer.parseInt(myObj.nextLine());
            System.out.println("inaltime: ");
            double inaltime = Double.parseDouble((myObj.nextLine()));
            clients.add(new Client(prenume, nume, varsta, greutate, inaltime));
        }
    }
}
