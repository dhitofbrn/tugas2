/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author lenovo
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pemain pemain;
        Status status = new Status("Available","Dhito Febrian");
        Posisi posisi = new Posisi("Sayap Kanan", "Dhito Febrian");
        pemain = status;
        
        System.out.println("");
        pemain.panggilpemain();
        
        System.out.println("");
        pemain = posisi;
        pemain.panggilpemain();
    }
    
}
