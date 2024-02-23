/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitlogic;

/**
 *
 * @author ILHAM
 */
public class BitLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String binary[] = {
        "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};	
	int a = 3;
	int b = 6;
	int c = a = b; 
	int d = a & b; 
	int e = a ^ b;
	int f = (~a & b) | (a & ~b);
	int g = ~a & 0x0f; // nilai ~a agar kurang dari 16
	System.out.println("a = " + binary[a]);
	System.out.println("b = " + binary[b]);
	System.out.println("a b = " + binary[c]);
	System.out.println("a & b = " + binary[d]);
	System.out.println("a ^ b = " + binary[e]);
	System.out.println("~a & ba & ~b  = " + binary[f]);
	System.out.println("~a = " + binary[g]);

    }
    
}
