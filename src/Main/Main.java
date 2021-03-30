package Main;
import model.*;
import service.*;


public class Main {
    public static void main(String[] args) {
//        MedicService medicService = new MedicService();
//        medicService.displayMedics();

        RetetaService retetaService = new RetetaService();
        retetaService.displayRetete();
        retetaService.displaySortedRetete();
    }
}
