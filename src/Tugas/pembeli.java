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
public class pembeli extends barang{
 public String namapembeli; 
public String alamatpembeli; 
public String idpembeli; 
public String notelp;
 
 public pembeli ( 
         String namapembeli, String alamatpembeli, String idpembeli, String notelp, String idbarang,
         String namabarang, String hargabarang, String merekbarang)

 {
     super(idbarang, namabarang, hargabarang, merekbarang);
     this.namapembeli = namapembeli;
     this.idpembeli = idpembeli;
     this.notelp = notelp;
     this.alamatpembeli = alamatpembeli;
 }
 
 public void keluaran()
 {
     System.out.println("No. Pembeli   : "+this.idpembeli);
     System.out.println("Nama          : "+this.namapembeli);
     System.out.println("Alamat        : "+this.alamatpembeli);
     System.out.println("No.Telepon    : "+this.notelp);
 }
}
