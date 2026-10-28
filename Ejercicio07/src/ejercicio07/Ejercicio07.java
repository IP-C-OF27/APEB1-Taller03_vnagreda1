/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Usuario
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int denominador1 = 81;
        int denominador2 = 9;
        int numerador = 3;
        int comparacion1 = 10;
        int comparacion2 = 1;
        int denominador3 = 100; 
        int numerador2 = 25;
        boolean raizcuadrada;
        boolean comparacion;
        boolean resultado3;
        boolean resultado;
        raizcuadrada = Math.sqrt(denominador1) + denominador2 / numerador == denominador2;
        comparacion = comparacion1 > comparacion2;
        resultado3 = denominador3/numerador2 >= Math.sqrt(denominador3);
        
        resultado = raizcuadrada || comparacion && resultado3;
        
        System.out.println("El resultado es " + resultado);
        
        
        
    }
    
}
