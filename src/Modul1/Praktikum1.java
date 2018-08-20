/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class Praktikum1 {
public static void main (String [] args) {
Scanner masukan = new Scanner(System.in);
int r;
double p=3.14;
System.out.print("Masukan Panjang Jari-jari : ");
r = masukan.nextInt();
System.out.println("Luas Permukaan Bola adalah : " +(4*p*r*r));
}
}
