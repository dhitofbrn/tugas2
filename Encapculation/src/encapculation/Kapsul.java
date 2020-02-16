/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapculation;

/**
 *
 * @author lenovo
 */
public class Kapsul {
    private double panjang;
    private double lebar;

    public Kapsul(){
        double panjang = 0;
        double lebar = 0;
        
    }
    
    private double luas(double p, double l){
        return p*l;
    }
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    
    public double getLuas(){
        return luas(panjang, lebar);
    }
}
