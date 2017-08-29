/* 
 * (Science: calculating energy) Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature. Your program
 * should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water. The formula to compute the energy is
 * Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius,
 * and energy Q is measured in joules.
 */
package s07ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creando nuevo objeto Scanner
        Scanner input = new Scanner(System.in);
        
        // Mostrar mensaje al usuario 
        System.out.print("Ingrese la cantidad de agua en kilogramos: ");
        double kilogramos = input.nextDouble();
        
        System.out.print("Ingrese la temperatura inicial: ");
        double temperaturaInicial = input.nextDouble();
        
        System.out.print("Ingrese la temperatura final: ");
        double temperaturaFinal = input.nextDouble();
        
        // Calculando la energia 
        double energia = kilogramos * (temperaturaFinal - temperaturaInicial) * 4184;
        
        // Mostrando el resultado 
        System.out.println("La energia requerida es: " + energia + " jules.");
        
        
        
        
        
        
    }
    
}
