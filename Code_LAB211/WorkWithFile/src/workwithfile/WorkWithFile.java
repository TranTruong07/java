/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwithfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class WorkWithFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        WorkWithFile wf = new WorkWithFile();
        String fileName = "D:\\Workspase\\Code_LAB211\\WorkWithFile\\user.dat";
        File f = new File(fileName);
        if(!f.exists()){
            f.createNewFile();
        }
        Scanner sc = new Scanner(System.in);
        int chose;
        do { 
            System.out.println("1. Create new");
            System.out.println("2. Login");
            System.out.println("3. exit");
            String user;
            String passWord;
            chose = sc.nextInt();
            sc.nextLine();
            switch(chose){
                case 1:
                    System.out.print("Enter user: ");
                    user = sc.nextLine();
                    System.out.print("Enter passWord: ");
                    passWord = sc.nextLine();
                    System.out.println(wf.addNewUser(f, user, passWord));
                    user = null;
                    passWord = null;
                    break;
                case 2:
                    System.out.print("Enter user: ");
                    user = sc.nextLine();
                    System.out.print("Enter passWord: ");
                    passWord = sc.nextLine();
                    if(login(f, user, passWord)){
                        System.out.println("Login succsesful");
                    }else{
                        System.out.println("inavalue");
                    }
                    break;
                case 3:
                    return;
            }
        } while (chose == 1 || chose == 2);
        
        
    }

    private static boolean login(File f, String user, String passWord) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String text;
        while((text = br.readLine()) != null){
            String[] arr = text.split(" ");
            if(arr[1].equals(user)){
                if(arr[3].equals(passWord)){
                    return true;
                }
            }
            
        }
        return false;
    }

    private boolean addNewUser(File f, String user, String passWord) throws IOException {
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String text = null;
        while((text = br.readLine()) != null){
            String[] arr = text.split(" ");
            if(arr[0].equals("User:")){
                if(arr[1].equals(user)){
                    return false;
                }
            }
        }
        bw.append("User: "+user+" ");
        bw.append("PassWord: "+passWord+"\n");
        bw.close();
        fw.close();
        br.close();
        fr.close();
        return true;
    }

}
