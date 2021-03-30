package service;

import model.Reteta;
import model.SortPret;

import java.util.*;


public class RetetaService {
    private List<Reteta> retete = new ArrayList<Reteta>();

    public RetetaService() {
        initializeRetete();
    }

    public void displayRetete()    {
        System.out.println(Arrays.toString(retete.toArray()));
    }

    public void displaySortedRetete()    {
        Collections.sort(retete, new SortPret());
        System.out.println(Arrays.toString(retete.toArray()));
    }

    private void initializeRetete() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nr Retete: ");
        int nr = Integer.parseInt(myObj.nextLine());
        for(int i = 0; i < nr; i++) {
            System.out.println("ID Client: ");
            int id = Integer.parseInt(myObj.nextLine());
            System.out.println("Pret: ");
            int pret = Integer.parseInt(myObj.nextLine());
            System.out.println("Diagnostic: ");
            String diagnostic = myObj.nextLine();
            retete.add(new Reteta(id, pret, diagnostic));
        }
    }
}
