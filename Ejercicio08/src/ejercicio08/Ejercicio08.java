/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Usuario
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factor1 = 10;
        int factor2 = 9;
        int suma1 = 20;
        int numerador = 500;
        int denominador = 2;
        int base = 3;
        int exponente = 2;
        int comparacion1 = 200;
        int comparacion = 50;
        int resta;
        int suma = 51;
        int resultadoDos;
        int multiplicacion;
        int division;
        double resultado2;
        boolean primeraComparacion;
        boolean comparacion2;
        boolean comparacionFinal;
        multiplicacion = factor1 * factor2;
        division = numerador / denominador;
        resultado2 = multiplicacion + suma - division + Math.pow(base,exponente);
        primeraComparacion = resultado2 >= comparacion1;
        resultadoDos = comparacion - comparacion + suma;
        comparacion2 = comparacion >=  resultadoDos;
        comparacionFinal = primeraComparacion || comparacion2;
        System.out.println("El resultado es: " + comparacionFinal);
        
        
        
        
        
         
        
                
        
        
        
        
          
                
    }
    
}
