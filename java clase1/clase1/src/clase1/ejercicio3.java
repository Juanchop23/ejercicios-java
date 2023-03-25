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
public class ejercicio3 {
    public static void main(String[] args) {
        //Para procesar info
        Scanner scanner = new Scanner(System.in);
        
        //Solicitando info
        System.out.print("Ingrese el monto total de su compra: ");
        double totalCompra = scanner.nextDouble();
        
        //Condicionales
        if(totalCompra == 1000 || totalCompra > 1000) {
            double precioDescuento = totalCompra - (totalCompra * 0.20);
            System.out.print("Sí aplica para descuento. Total: " + precioDescuento);
        } else {
            System.out.print("No aplica para descuentos: ");
        }
    }
}
