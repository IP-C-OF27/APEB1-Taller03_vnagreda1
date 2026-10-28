/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Usuario
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double raiz1 = 81;
        double raiz2 = 25;
        double factor = 10;
        int comparacion = 50;
        double expresion;
        boolean comparar;
        double  raices; 
        raices = Math.sqrt(raiz1) + Math.sqrt(raiz2);
        expresion = raices * factor;
        comparar = expresion >= comparacion;
        System.out.println("El resultado es:" + comparar );
        
             
    }
    
}
