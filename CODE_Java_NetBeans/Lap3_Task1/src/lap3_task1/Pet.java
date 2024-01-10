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
public class Pet {
    private String id;
    private String name, owner;

    public Pet(String id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }
    public String getDetails(){
        return "id"+ ":" +this.id + ","+ "name"+":"+ this.name +"," + "owner"+":"+ this.owner;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + ", owner=" + owner + '}';
    }
    
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
            
    
}
