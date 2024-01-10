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
public class Cat extends Pet{
    private String hairType;

    public Cat(String id, String name, String owner, String hairType) {
        super(id, name, owner);
        this.hairType = hairType;
    }
    
    public String getDetails(){
        return "id"+ ":" +super.getId() + ","+ "name"+":"+ super.getName() +"," + "owner"+":"+ super.getOwner()
                +","+ "hairType"+ ":" + this.hairType;
    }

    @Override
    public String toString() {
        return "Cat{" + "hairType=" + hairType + '}';
    }

    public String getHairType() {
        return hairType;
    }
    
}
