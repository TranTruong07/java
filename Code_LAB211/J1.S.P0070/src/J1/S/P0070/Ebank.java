/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0070;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import model.User;

/**
 *
 * @author Admin
 */
public class Ebank {

    private static Scanner sc = new Scanner(System.in);
    private ResourceBundle rsBl;
    private Locale lc;
    private String account, password, captchacode;
    private List<User> uList;

    public Ebank() {
        this.uList = new ArrayList<>();
    }

    public void display() {
        do {
            System.out.println("------------Login Program------------\n"
                    + "1. Vietnamese\n"
                    + "2. English\n"
                    + "3. Exit");
            if (select()) {
                return;
            }
            rsBl = ResourceBundle.getBundle("j1.s.p0070.properties", lc);
            account = getAccount();
            password = Validation.getPassword(rsBl.getString("PassWord"), rsBl.getString("PassWordErro"));

            captchacode = getCaptcha(6);
            System.out.println(rsBl.getString("Captcha") + captchacode);
            while (true) {
                System.out.println(rsBl.getString("InputCaptcha"));
                String captcha = sc.nextLine();
                if (captcha.equals(captchacode)) {
                    User user = new User(account, password);
                    uList.add(user);
                    System.out.println("Added");
                    break;
                } else {
                    System.out.println(rsBl.getString("CaptchaErro"));
                }
            }
        } while (true);
    }

    private String getAccount() {
        do {
            try {
                String account = Validation.getAccount(rsBl.getString("Account"), rsBl.getString("AccountErro"));
                if (checkNotExit(account)) {
                    return account;
                }
            } catch (Exception e) {
            }
        } while (true);
    }

    private boolean select() {
        int x = Validation.getInt("Please choice one option: ", 1, 3);
        switch (x) {
            case 1:
                lc = new Locale("vi", "VN");
                return false;
            case 2:
                lc = new Locale("en", "UK");
                return false;
            case 3:
                return true;
            default:
                return true;
        }
    }
    private static String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0987654321";

    private String getCaptcha(int i) {
        String captcha = "";
        while (captcha.length() < i) {
            Random r = new Random();
            int x = r.nextInt(62);
            captcha += alpha.charAt(x);
        }
        return captcha;
    }

    public void loadFile(String usertxt) {
        if (!uList.isEmpty()) {
            uList.clear();
        }
        try {
            FileInputStream is = new FileInputStream(usertxt);
            ObjectInputStream ois = new ObjectInputStream(is);
            while (true) {
                try {
                    User user = (User) (ois.readObject());
                    uList.add(user);
                } catch (EOFException eof) {
                    break;
                }
            }
            ois.close();
            is.close();
            System.out.println("Load successfull");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Load Error");
        }
    }

    public void saveFile(String usertxt) {
        if (uList.isEmpty()) {
            System.out.println("List empty");
            return;
        }
        try {
            OutputStream os = new FileOutputStream(usertxt);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (User user : uList) {
                oos.writeObject(user);
            }
            oos.close();
            os.close();
            System.out.println("Save successfull");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void showData() {
        if (uList.isEmpty()) {
            System.out.println("List empty");
            return;
        }
        for (User user : uList) {
            System.out.println(user.toString());
        }
    }

    private boolean checkNotExit(String account) {
        if(uList.isEmpty()) return true;
        for (User user : uList) {
            if(user.getAccount().equalsIgnoreCase(account)){
                System.out.println("Duplicate account");
                return false;
            }
        }
        return true;
    }

}
