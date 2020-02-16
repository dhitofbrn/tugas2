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
public class Posisi extends Pemain {
    public String posisi_pemain;

    public Posisi(String posisi_pemain, String nama_pemain) {
        super(nama_pemain);
        this.posisi_pemain = posisi_pemain;
    }

    @Override
    public void panggilpemain() {
        System.out.println("Nama Pemain : "+super.nama_pemain);
        System.out.println("Posisi Pemain : "+posisi_pemain);
    }
    
    
    
}
