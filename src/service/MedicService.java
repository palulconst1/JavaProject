package service;

import model.Medic;

import java.util.*;


public final class MedicService {
    private Set<Medic> medics = new HashSet<Medic> ();

    public MedicService() {
        initializeMedics();
    }

    public void displayMedics()    {
        System.out.println(Arrays.toString(medics.toArray()));
    }

    private void initializeMedics() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nr Medici: ");
        int n = Integer.parseInt(myObj.nextLine());
        for(int i = 0; i < n; i++) {
            System.out.println("Nume: ");
            String nume = myObj.nextLine();
            System.out.println("prenume: ");
            String prenume = myObj.nextLine();
            medics.add(new Medic(prenume, nume));
        }
    }

}
