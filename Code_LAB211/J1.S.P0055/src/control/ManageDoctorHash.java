/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.HashMap;
import java.util.Map;
import model.Doctor;

/**
 *
 * @author Admin
 */
public class ManageDoctorHash {

    HashMap<String, Doctor> hashMap = new HashMap<>();

    public void showMenu() {
        System.out.println("1. Add Doctor\n"
                + "2. Update Doctor.\n"
                + "3. Delete Doctor\n"
                + "4. Search Doctor.\n"
                + "5. Exit.");
    }

    public HashMap<String, Doctor> getHashMap() {
        return hashMap;
    }

    public boolean addDoctor(Doctor d) throws Exception {
        hashMap.put(d.getCode(), d);
        return true;
    }

    public boolean updateDoctor(Doctor d) throws Exception {
        hashMap.put(d.getCode(), d);
        return true;
    }

    public boolean deleteDoctor(String s) throws Exception {
        hashMap.remove(s);
        return true;
    }

    public HashMap<String, Doctor> searchDoctor(String input) throws Exception {
        HashMap<String, Doctor> hm = new HashMap<>();
        for (Map.Entry<String, Doctor> entry : hashMap.entrySet()) {
            String k = entry.getKey();
            if (k.equals(input)) {
                hm.put(k, entry.getValue());
            }
        }
        return hm;
    }
}
