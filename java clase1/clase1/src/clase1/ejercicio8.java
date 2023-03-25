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
public class ejercicio8 {
    public static void main(String[] args) {
        //Solicitando datos
        Scanner sc = new Scanner(System.in);
        
        // Leer datos del artículo
        System.out.print("Ingrese el nombre del artículo: ");
        String nombreArticulo = sc.nextLine();
        
        System.out.print("Ingrese la clave (01 o 02): ");
        String clave = sc.nextLine();
        
        System.out.print("Ingrese el precio original: ");
        double precioOriginal = sc.nextDouble();
        
        // Calcular descuento y precio con descuento
        double descuento = 0;
        if (clave.equals("01")) {
            descuento = 0.1;
        } else if (clave.equals("02")) {
            descuento = 0.2;
        } else {
            System.out.println("Clave no válida");
            return;
        }
        
        double precioConDescuento = precioOriginal * (1 - descuento);
        
        // Imprimir resultado
        System.out.println("Artículo: " + nombreArticulo);
        System.out.println("Clave: " + clave);
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio con descuento: " + precioConDescuento);
    }
}
