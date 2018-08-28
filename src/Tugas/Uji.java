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
public class Uji extends pembeli{
    public int jumlah;
    
    public Uji(String namapembeli,
         String alamatpembeli, String idpembeli, String notelp, String idbarang,
         String namabarang, String hargabarang, String merekbarang) 
    {
    super(namapembeli, alamatpembeli, idpembeli, notelp, idbarang, namabarang, hargabarang, merekbarang);
    int jml = 10000;
    this.jumlah=jml;
    }
    
    public void keluaran ()
    {
        super.keluaran();
        System.out.println("Jumlah   : "+this.jumlah);
    }
    
    public static void main(String[] args) {
       System.out.println("=====================");
       System.out.println("Kasir    : Admin");
       System.out.println("Tanggal  : 28-08-2018");
       System.out.println("=====================");
       System.out.println("Data Pembelian Barang : ");
       Uji transaksi = new Uji ("1","Baihaqi","Mojokerto","082230769861","2603","odol","10000","lifeboy")
       transaksi.keluaran();
    }
    
}
