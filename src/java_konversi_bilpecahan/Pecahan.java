/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_konversi_bilpecahan;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author poncoe
 */
public class Pecahan {

    /**
     * @param args the command line arguments
     */
    
    // Contoh: Jika Pegguna Memasukan 0.35 Maka Pecahan Tak Terduksinya adalah 7/20.
    public static void pecahan(double x) {
        String a = "" + x;
        String spilts[] = a.split("\\."); // split menggunakan desimal
        int b = spilts[1].length(); // temukan panjang desimal
        int penyebut = (int) Math.pow(10, b); // menghitung penyebut
        int pembilang = (int) (x * penyebut); // menghitung pembilang x
        // 1.2*10 = 12
        int gcd = getGCD(pembilang, penyebut); // Temukan kesamaan terbesar
        // divisor (hasil bagi) dari mereka
        String pecahan = "" + pembilang / gcd + "/" + penyebut / gcd;
        System.out.println(pecahan);
    }

    // rekursif algoritma gcd
    public static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        pecahan(0.35);
        pecahan(1.2);
    }
}
