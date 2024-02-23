/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blokscopedemo;

/**
 *
 * @author ILHAM
 */
public class BlokScopeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        int panjang = 30;
        int lebar = 20;
        hitungLuas();
        luasPersegiPanjang(panjang, lebar);
    }
    
    public static void hitungLuas()
     {
          int p=30,l=20;
          int Luas=p * l;
          System.out.println("LUAS = "+Luas);
    }
    
    public static void luasPersegiPanjang(int panjang, int lebar) {
        int luasPP = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah = "+luasPP);
    }

    
}
