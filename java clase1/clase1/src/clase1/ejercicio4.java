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
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        //Variables
        int horastrabajadas, total, extras;
        
        //Información
        System.out.println("Ingrese el número de horas trabajadas");
        horastrabajadas = entrada.nextInt();
        
        //Procesamiento
        if (horastrabajadas <= 40) {
            total = horastrabajadas * 16;
            System.out.println("Su sueldo es de $:" + total);
        } else {
            extras = horastrabajadas - 40;
            total = (extras * 20) + (40 * 16);
            System.out.println("Su sueldo es de $:" + total);
        }
    }
}
