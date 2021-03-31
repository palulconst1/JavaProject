package service;

import model.*;

import java.util.*;

public class CabinetService {
    private Set<Cabinet> cabinets = new HashSet<Cabinet> ();
    public CabinetService() {
        initializeCabinets();
    }
    public void displayCabinets()    {
        System.out.println(Arrays.toString(cabinets.toArray()));
    }
    private void initializeCabinets() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nr Cabinete: ");
        int n = Integer.parseInt(myObj.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Adresa: ");
            String adresa = myObj.nextLine();
            cabinets.add(new Cabinet(adresa));
        }
    }
}
