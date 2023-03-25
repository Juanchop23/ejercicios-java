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
public class ejercicio6 {
    public static void main(String[] args) {
        //Leer datos del teclado
        Scanner scanner = new Scanner(System.in);
        
        //Solicitando información
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        //Organizando los datos
        if (num1 > num2) {
            int reorganizar = num1;
            num1 = num2;
            num2 = reorganizar;
        }
        
        System.out.println("Los números en forma ascendente son: " + num1 + ", " + num2);
    }
}
