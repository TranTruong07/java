/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EastAsiaCountries extends Country{
    private String countryTerrain;

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String display() {
        return super.display()+String.format(" %-5s", countryTerrain); //To change body of generated methods, choose Tools | Templates.
    }
    
}
