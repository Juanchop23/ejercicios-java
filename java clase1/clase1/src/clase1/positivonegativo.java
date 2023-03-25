/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Sala403-3
 */
public class positivonegativo {

    //Capturar un número e imprimir si es positivo o negativo
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        // Mensaje
        System.out.println("Escribe un número:");
        
        // Leer loa información
        double numero = escaner.nextDouble();
        // Comparando con flow
        if (numero == 0) {
            System.out.println("El número es cero");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
    }
}
