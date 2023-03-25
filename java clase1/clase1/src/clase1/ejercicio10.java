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

public class ejercicio10 {
    public static void main(String[] args) {
        //Escaneando información
        Scanner sc = new Scanner(System.in);
        
        // Leer monto total de la compra
        System.out.print("Ingrese el monto total de la compra: ");
        double montoTotal = sc.nextDouble();
        
        // Calcular pago propio, préstamo y crédito
        double pagoPropio = 0;
        double prestamo = 0;
        double credito = 0;
        if (montoTotal > 500000) {
            pagoPropio = montoTotal * 0.55;
            prestamo = montoTotal * 0.3;
            credito = montoTotal - pagoPropio - prestamo;
        } else {
            pagoPropio = montoTotal * 0.7;
            credito = montoTotal - pagoPropio;
        }
        
        // Calcular intereses
        double intereses = credito * 0.2;
        
        // Calcular monto total a pagar
        double totalAPagar = pagoPropio + prestamo + credito + intereses;
        
        // Imprimir resultado
        System.out.println("Monto total de la compra: " + montoTotal);
        System.out.println("Pago propio: " + pagoPropio);
        System.out.println("Préstamo: " + prestamo);
        System.out.println("Crédito: " + credito);
        System.out.println("Intereses: " + intereses);
        System.out.println("Total a pagar: " + totalAPagar);
    }
}
