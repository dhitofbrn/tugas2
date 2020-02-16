/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author lenovo
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buaya object = new Buaya();
        
        object.tampilSuara();
        object.suaraBuaya();
        
        Kadal object2 = new Kadal();
        
        object2.tampilSuara();
        object2.suarakadal();
    }
    
}
