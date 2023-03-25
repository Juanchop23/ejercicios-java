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

public class ejercicio1 {
    /*Un hombre desea saber cuánto dinero se genera por concepto de intereses 
sobre la cantidad que tiene en inversión en el banco. El decidirá reinvertir 
los intereses siempre y cuando estos excedan a $7000, y en ese caso desea saber 
cuánto dinero tendrá finalmente en su cuenta.
*/

    public static void main(String[] args) {
        //Escaneando información
        Scanner scanner = new Scanner(System.in);
        
        //Solicitando info
        System.out.print("Ingrese la cantidad de dinero en inversión: ");
        double cantidad = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interés anual: ");
        double tasa = scanner.nextDouble();
        
        //Calculando
        double intereses = cantidad * tasa;
        double total = cantidad + intereses;
        System.out.println("Intereses generados: $" + intereses);
        if (intereses > 7000) {
            total += intereses;
            System.out.println("Total después de reinvertir intereses: $" + total);
        }
    }
}
