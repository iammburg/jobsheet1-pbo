/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmatika2;

/**
 *
 * @author ILHAM
 */
public class Aritmatika2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 42;
	double y = 42.3;  
	int a = 1;
	int b = 2;
	int c = 3; 
	a += 5;
	b += 4;
	c += a * b;
	c %= 6;
		
	System.out.println("x mod 10 = " + x % 10);
	System.out.println("y mod 10 = " + y % 10);
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);

    }
    
}
