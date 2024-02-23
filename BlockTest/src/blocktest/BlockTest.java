/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blocktest;

/**
 *
 * @author ILHAM
 */
public class BlockTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        y = 20;
       // target dari  loop adalah sebuah  block
        for(x = 0; x<10; x++)
            {
                 System.out.println("Nilai  x adalah : " + x);
                 System.out.println("Nilai  y adalah : " + y);
                 y = y - 2;
            }

    }
    
}
