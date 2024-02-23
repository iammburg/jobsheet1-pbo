/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package light;

/**
 *
 * @author ILHAM
 */
public class Light {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60; //  konversi ke menit
        distance = lightspeed * seconds; // hitung jarak

        System.out.print("Dalam " + days);
        System.out.print(" hari, cahaya akan berjalan kira-kira ");
        System.out.println(distance + " miles.");

    }
    
}
