package Main;

import model.*;
import service.*;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner myObj = new Scanner(System.in);
//        int ok = 1;
//        while(ok == 1) {
//            System.out.println("Introduceti optiunea dorita: ");
//            System.out.println("Introduceti Medici: 1");
//            System.out.println("Introduceti Clienti: 2");
//            System.out.println("Introduceti Retete: 3");
//            System.out.println("Introduceti Cabinete: 4");
//            System.out.println("Introduceti Programari: 5");
//            System.out.println("Oprire: 6");
//            System.out.println("Optiune: ");
//            int opt = Integer.parseInt(myObj.nextLine());
//            switch (opt) {
//                case 1:
//                    MedicService medicService = new MedicService();
//                    medicService.displayMedics();
//                    break;
//                case 2:
//                    ClientService clientService = new ClientService();
//                    clientService.displayClients();
//                    break;
//                case 3:
//                    RetetaService retetaService = new RetetaService();
//                    retetaService.displayRetete();
//                    retetaService.displaySortedRetete();
//                    break;
//                case 4:
//                    CabinetService cabinetService = new CabinetService();
//                    cabinetService.displayCabinets();
//                    break;
//                case 5:
//                    ProgramareService programareService = new ProgramareService();
//                    programareService.displayProgramares();
//                    break;
//                case 6:
//                    ok = 0;
//                    break;
//            }
//        }
        final MedicService medicService = MedicService.getInstance();
        final MedicService2 medicService2 = MedicService2.getInstance();
        System.out.println(medicService.getMedics());
        MedicMilitar m = new MedicMilitar("a","b","3");
        medicService.addMedic(m);
        System.out.println(medicService.getMedics());

    }
}
