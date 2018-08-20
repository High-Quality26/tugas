/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class nomer5 {
   public static void main (String[] args) {
   Scanner masukan = new Scanner(System.in);
   int nilai;
   System.out.print("Masukan Nilai Akhir PBO : ");
   nilai = masukan.nextInt();
   if (nilai < 70)
   System.out.println("Siswa tidak LULUS");
   if (nilai >= 70)
   System.out.println("Siswa LULUS");
   } 
}
