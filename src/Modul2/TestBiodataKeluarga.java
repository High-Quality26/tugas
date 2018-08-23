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
public class TestBiodataKeluarga {
    public static void main(String args[]){
        BiodataKeluarga keluarga = new BiodataKeluarga();
        keluarga.setnamaAyah("Sapa Hayoh");
        keluarga.setnamaIbu("Sapa Hayoh");
        keluarga.setnamaSendiri("Baihaqi Ilman Haydar Permana");
        keluarga.setnamaSaudara1("Afifah Wildan Ulya Permana");
        keluarga.setnamaSaudara2("Jauhar Abdillah Ilham Permana");
        keluarga.setalamat("Jl.Muria Raya No.3 Kedundung Indah Mojokerto");
        keluarga.sethobi("Basket, Gaming");
        keluarga.setcita2("Programmer");
        keluarga.setumur(17);
        
        System.out.println("NamaAyah     : " + keluarga.getnamaAyah());
        System.out.println("NamaIbu      : " + keluarga.getnamaIbu());
        System.out.println("NamaSendiri  : " + keluarga.getnamaSendiri());
        System.out.println("NamaSaudara1 : " + keluarga.getnamaSaudara1());
        System.out.println("NamaSaudara2 : " + keluarga.getnamaSaudara2());
        System.out.println("Alamat       : " + keluarga.getalamat());
        System.out.println("Hobi         : " + keluarga.gethobi());
        System.out.println("Cita-cita    : " + keluarga.getcita2());
        System.out.println("Umur         : " + keluarga.getumur());
    }
}
