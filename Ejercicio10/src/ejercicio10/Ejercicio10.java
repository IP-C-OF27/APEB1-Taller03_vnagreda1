/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double raiz = 25;
        double factor = 10;
        int comparacion1 = 100;
        double primeraC;
        boolean compar;
        int denominador = 5;
        int comparacion2 = 2;
        double comparar;
        boolean comparacionfinal;
        boolean segundaC;
        primeraC = Math.sqrt(raiz) * factor;
        compar = primeraC >= comparacion1;
        
        comparar = factor / denominador;
        segundaC = comparar >= comparacion2;
        comparacionfinal = compar && true || false|| segundaC;
        System.out.println("El resultado es: "+ comparacionfinal);
        
        
        
        
               
    }
    
}
