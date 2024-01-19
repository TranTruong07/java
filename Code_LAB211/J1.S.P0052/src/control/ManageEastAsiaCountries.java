
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
public class ManageEastAsiaCountries {
    List<EastAsiaCountries> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public void showMenu() {
        System.out.println("1. Enter the information for 11 countries in Southeast Asia.\n"
                + "2. Display the information of country you've just input.\n"
                + "3. Search the country according to the entered country's name.\n"
                + "4. Display the information increasing with the country name.\n"
                + "5. Exit.");
    }
    
    public void addCountryInformation(EastAsiaCountries country) throws Exception{
        list.add(country);
    }

    public List<EastAsiaCountries> getList() {
        return list;
    }
    
    
    public EastAsiaCountries getRecentlyEnteredInformation() throws Exception{
        if(list.size() == 0){
            return null;
        }else{
            EastAsiaCountries asiaCountries = (EastAsiaCountries) list.get(list.size()-1);
            return asiaCountries;
        }
    }
    
     public EastAsiaCountries[] searchInformationByName(String name) throws Exception{
         EastAsiaCountries[] asiaCountrieses = new EastAsiaCountries[11];
         int i = 0;
         for (EastAsiaCountries object : list) {
             if(object.getCountryName().equals(name)){
                 asiaCountrieses[i] = object;
                 i++;
             }
         }
         return asiaCountrieses;
     }
     
     public EastAsiaCountries[]sortInformationByAscendingOrder() throws Exception{
         EastAsiaCountries[] asiaCountrieses = new EastAsiaCountries[11];
         int i = 0;
         Collections.sort(list, new Comparator<EastAsiaCountries>() {
             @Override
             public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                 return o1.getCountryName().compareTo(o2.getCountryName());
             }
         });
         for (EastAsiaCountries eastAsiaCountries : list) {
             asiaCountrieses[i] = eastAsiaCountries;
             i++;
         }
         return asiaCountrieses;
     }

    void ghiVoFile() {
        File f = new File("D:\\Workspase\\Code_LAB211\\J1.S.P0052\\data.txt");
        if(!f.exists()){
            
        }
    }

}
