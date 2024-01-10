/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_task1;

/**
 *
 * @author Admin
 */
public class Dog extends Pet{
    private String size;

    public Dog(String id, String name, String owner, String size) {
        super(id, name, owner);
        this.size = size;
    }
    
    public String getDetails(){
        return "id"+ ":" +super.getId() + ","+ "name"+":"+ super.getName() +"," + "owner"+":"+ super.getOwner()
                +","+ "size"+ ":" + this.size;
    }

    @Override
    public String toString() {
        return "Dog{" + "size=" + size + '}';
    }

    public String getSize() {
        return size;
    }
    
    
}
