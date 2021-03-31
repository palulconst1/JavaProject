package service;

import model.*;
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
            System.out.println("Tip medic: 1-medic 2-familie 3-specializat 4-militar");
            int tip = Integer.parseInt(myObj.nextLine());
            System.out.println("Nume: ");
            String nume = myObj.nextLine();
            System.out.println("prenume: ");
            String prenume = myObj.nextLine();

            switch(tip) {
                case 1:
                    medics.add(new Medic(prenume, nume));
                    break;
                case 2:
                    medics.add(new MedicFamilie(prenume, nume));
                    break;
                case 3:
                    System.out.println("specializare: ");
                    String special = myObj.nextLine();
                    medics.add(new MedicSpecializat(prenume, nume, special));
                    break;
                case 4:
                    System.out.println("Rank: ");
                    String rank = myObj.nextLine();
                    medics.add(new MedicMilitar(prenume, nume, rank));
                    break;
            }
        }
    }

}
