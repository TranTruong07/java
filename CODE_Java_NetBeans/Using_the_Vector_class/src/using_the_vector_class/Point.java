/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using_the_vector_class;

/**
 *
 * @author Admin
 */
public class Point {
    int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int xx, int yy) {
        x = xx;
        y = yy;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + ']';
    }
    
}
