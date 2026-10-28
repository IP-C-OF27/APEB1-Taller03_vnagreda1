/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Usuario
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v1 = 81;
        double v2 = 9;
        double v3 = 3;
        double v5 = 10;
        double v6 = 1;
        boolean resultado;
        boolean resultado1;
        boolean resultado2;
        resultado1 = ((Math.sqrt(v1) + v2)/v3) == v2;
        resultado2 = (v5 > v6);
        resultado = resultado1 && resultado2;
        System.out.println("El resultado es " + resultado);
        
                
    }
    
}
