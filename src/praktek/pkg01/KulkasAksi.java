/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek.pkg01;

/**
 *
 * @author proWindows8.1
 */
public class KulkasAksi {
    public static void main(String[] args) {
        Kulkas Panasonic = new Kulkas();
        Kulkas Sharp = new Kulkas();
        Kulkas Polytron = new Kulkas();
        
        Panasonic.merek="Panasonic";
        Panasonic.model="Dua Pintu";
        Panasonic.ukuran="Kecil";
        Panasonic.warna="Merah";
        Panasonic.harga="20 Juta";
        
        Sharp.merek="Sharp";
        Sharp.model="Satu Pintu";
        Sharp.ukuran="Besar";
        Sharp.warna="Biru";
        Sharp.harga="15 Juta";
        
        Polytron.merek="Polytron";
        Polytron.model="Tiga Pintu";
        Polytron.ukuran="Sedang";
        Polytron.warna="Emas";
        Polytron.harga="25 Juta";
        
        Panasonic.cetakInfo();
        Sharp.cetakInfo();
        Polytron.cetakInfo();
    }
}
