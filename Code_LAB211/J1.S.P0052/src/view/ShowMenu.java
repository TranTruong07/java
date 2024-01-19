
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ShowMenu {

    public static void show() throws Exception {
        ManageEastAsiaCountries meact = new ManageEastAsiaCountries();
        Scanner sc = new Scanner(System.in);
        int chose = 1;
        do {
            meact.showMenu();
            chose = Validation.getInt("Enter nuber from 1 to 5", 1, 5);
            switch (chose) {
                case 1:
                    System.out.println("Enter code of country");
                    String code = sc.nextLine();
                    String name = Validation.getName("Enter name of country", meact.list);

                    float area = Validation.getFloat("Enter total Area", 0.1, Integer.MAX_VALUE);
                    System.out.println("Enter terrain of country");
                    String terrain = sc.nextLine();
                    EastAsiaCountries country = new EastAsiaCountries(terrain, code, name, area);
                    meact.addCountryInformation(country);
                    break;
                case 2:
                    System.out.println("ID" + "\t" + "Name" + "\t   " + "Total Area\t" + " Terrain\t");
                    System.out.println(meact.getRecentlyEnteredInformation().display());
                    break;
                case 3:
                    System.out.print("Enter name of country: ");
                    String nameCoutry = sc.nextLine();
                    System.out.println("ID" + "\t" + "Name" + "\t   " + "Total Area\t" + " Terrain\t");
                    for (int i = 0; i < meact.searchInformationByName(nameCoutry).length; i++) {
                        if (meact.searchInformationByName(nameCoutry)[i] == null) {
                            break;
                        }
                        System.out.println(meact.searchInformationByName(nameCoutry)[i].display());
                    }
                    break;
                case 4:
                    System.out.println("ID" + "\t" + "Name" + "\t   " + "Total Area\t" + " Terrain\t");

                    for (int i = 0; i < meact.sortInformationByAscendingOrder().length; i++) {
                        if (meact.sortInformationByAscendingOrder()[i] == null) {
                            break;
                        }
                        System.out.println(meact.sortInformationByAscendingOrder()[i].display());
                    }
                    break;
                case 5:
                    System.out.println("lua data vao file");
                    meact.ghiVoFile();
                    break;
                case 6:
                    return;
            }

        } while (chose >= 1 && chose <= 5);
    }

}
