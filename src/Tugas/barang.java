/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author WINDOWS 10
 */
public class barang {
 public String namabarang; 
public String merekbarang; 
public String idbarang; 
public String hargabarang;
 
 public barang (String idbarang, String hargabarang, String namabarang, String merekbarang){
     this.idbarang = idbarang;
     this.hargabarang = hargabarang;
     this.namabarang = namabarang;
     this.merekbarang = merekbarang;
 }
 public void keluaran()
 {
     System.out.println(" Nama Barang   : "+this.namabarang);
     System.out.println(" ID Barang     : "+this.idbarang);
     System.out.println(" Harga Barang  : "+this.hargabarang);
     System.out.println(" Merek Barang  : "+this.merekbarang);
 }
}
