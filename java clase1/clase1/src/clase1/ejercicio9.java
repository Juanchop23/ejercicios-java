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
public class ejercicio9 {
    public static void main(String[] args) {
        //Solicitando datos
        Scanner sc = new Scanner(System.in);
        
        // Leer cantidad de camisas
        System.out.print("Ingrese la cantidad de camisas que desea comprar: ");
        int cantidadCamisas = sc.nextInt();
        
        // Calcular descuento y total a pagar
        double descuento = 0;
        if (cantidadCamisas >= 3) {
            descuento = 0.2;
        } else {
            descuento = 0.1;
        }
        
        System.out.print("Ingrese el precio unitario de las camisas: ");
        double precioUnitario = sc.nextDouble();
        
        double totalSinDescuento = cantidadCamisas * precioUnitario;
        double totalConDescuento = totalSinDescuento * (1 - descuento);
        
        // Imprimir resultado
        System.out.println("Cantidad de camisas: " + cantidadCamisas);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total sin descuento: " + totalSinDescuento);
        System.out.println("Total con descuento: " + totalConDescuento);
    }
}
