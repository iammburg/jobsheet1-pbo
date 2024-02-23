/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variabledemo;

/**
 *
 * @author ILHAM
 */
public class VariableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; // mendeklarasikan variable jum
        int jum = 500; // memberikan jum nilai 500
        System.out.println("Nilai jumlah: " +jum);
        jum = jum * 2;
        System.out.print("Hasil perkalian jum * 2 adalah =  ");
        System.out.println(jum);
        
        for (int i = 0; i < 5; i++) 
        {
            if (i < 3) {
                System.out.println(i);
            }
        }
    }
    
}
