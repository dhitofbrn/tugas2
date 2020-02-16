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
public class Encapculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kapsul pp = new Kapsul();
        pp.setPanjang(60);
        pp.setLebar(120);
        System.out.println("Panjang : "+pp.getPanjang());
        System.out.println("Lebar : "+pp.getLebar());
        System.out.println("Luas : "+pp.getLuas());
    }
    
}
