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
public class Status extends Pemain {
    public String status_pemain;

    public Status(String status_pemain, String nama_pemain) {
        super(nama_pemain);
        this.status_pemain = status_pemain;
    }

    @Override
    public void panggilpemain() {
       System.out.println("Nama Pemain : "+super.nama_pemain);
       System.out.println("Status Pemain : "+status_pemain);
   
    }
    
    
    
}
