/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author WINDOWS 10
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus();
        busMini.Penumpang = 5;
        busMini.maxPenumpang = 15;
        busMini.cetak();
        
        busMini.Penumpang = busMini.Penumpang + 5;
        busMini.cetak();
        
        busMini.Penumpang = busMini.Penumpang - 2;
        busMini.cetak();
        
        busMini.Penumpang = busMini.Penumpang + 8;
        busMini.cetak();
        
        
    }
}
