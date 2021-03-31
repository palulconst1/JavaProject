package service;

import model.*;
import java.util.*;

public class ProgramareService {
    private Set<Programare> programares = new HashSet<Programare>();
    public ProgramareService() {
        initializepPogramares();
    }
    public void displayProgramares()    {
        System.out.println(Arrays.toString(programares.toArray()));
    }
    private void initializepPogramares() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nr Retete: ");
        int n = Integer.parseInt(myObj.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("id medic: ");
            int medic = Integer.parseInt(myObj.nextLine());
            System.out.println("id client: ");
            int client = Integer.parseInt(myObj.nextLine());
            System.out.println("id cabinet: ");
            int cabinet = Integer.parseInt(myObj.nextLine());
            System.out.println("id reteta: ");
            int reteta = Integer.parseInt(myObj.nextLine());
            System.out.println("ora: ");
            String ora = myObj.nextLine();
            System.out.println("data: ");
            String data = myObj.nextLine();
            programares.add(new Programare(medic, client, cabinet, reteta, ora, data));
        }
    }
}
