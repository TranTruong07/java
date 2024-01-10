/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxPkg;

import rectPkg.Rectangle;

/**
 *
 * @author Admin
 */
public class Box extends Rectangle{
    private int height = 0;
    public Box() {
        super();
    }
    public Box (int l, int w, int h){
        super(l, w);
        height = h>0? h:0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + getLength() +","+ getWidth()+ ","+ getHeight() + "]";
    }
    public int area() {
        int l = this.getLength();
        int w = this.getWidth();
        int h = this.getHeight();
        return 2*(l*w + w*h + h*l);
    }
    
    // additional maethod
    public static int volum(){
        //return this.getLength()*this.getWidth()*height;
        return 0;
    }
}
