
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Student implements Comparable {

    int no;

    public Student(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        if (no > st.getNo()) {
            return 1;
        } else if (no == st.getNo()) {
            return 0;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Random r = new Random();
        TreeSet myset = new TreeSet();
        for (int i = 0; i < 10; i++) {
            int no = r.nextInt(100);
            Student st = new Student(no);
            myset.add(st);
        }
        //using Iterator
        Iterator iter = myset.iterator();
        while (iter.hasNext()) {
            Student st = (Student) iter.next();
            System.out.println("No: " + st.getNo());

        }

    }
