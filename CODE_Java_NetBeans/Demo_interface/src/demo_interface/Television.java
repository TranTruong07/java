/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_interface;

/**
 *
 * @author Admin
 */
public class Television implements VNRemote{

    
    @Override
    public void onDevice() {
        System.out.println("on TV"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void offDevice() {
       System.out.println("off TV"); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VNRemote rm = new Television();
        rm.setLock();
        rm.onDevice();
        rm.offDevice();
        VNRemote.setTimer(10000);
        System.out.println("TV remote's price: "+ VNRemote.price);
        System.out.println("TV remote has: "+ VNRemote.MAXofButtons + "buttons");
    }

}
