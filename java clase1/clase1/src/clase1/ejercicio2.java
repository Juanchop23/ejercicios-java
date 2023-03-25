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
public class ejercicio2 {
    public static void main(String[] args) {
        //Escaneando información
        Scanner scanner = new Scanner(System.in);
        
        //Solicitando información
        System.out.print("Ingrese la nota del alumno (de 0 a 100): ");
        double nota = scanner.nextDouble();
        
        //Condiciones
        if (nota > 70 || nota == 70) {
            System.out.println("Curso aprobado: ");
        } else {
            System.out.println("Reprobado. Devuélvase pal SENA: ");
        }
    }
}
