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
public class sabado1 {

    public static void main(String[] args) {
        //Variables
        double base, altura, resultado;
        Scanner obj = new Scanner(System.in);

        //Capturando datos
        System.out.print("Ingrese base:\t");
        base = obj.nextDouble();

        System.out.print("Ingrese altura:\t");
        altura = obj.nextDouble();

        //Imprimiendo el resultado
        resultado = ((base * altura) / 2);

        System.out.print("El area del Triangulo es:\t" + resultado);
    }
}
