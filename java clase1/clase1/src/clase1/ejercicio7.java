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
public class ejercicio7 {
    public static void main(String[] args) {
        //Solicitando datos
        Scanner sc = new Scanner(System.in);
        
        //Preguntando al usuario por los datos
        System.out.print("¿Qué actividad va a realizar? (dormir/sentado en reposo): ");
        String actividad = sc.nextLine();
        
        //Tiempo de la actividad
        System.out.print("¿Cuántos minutos va a realizar esa actividad? ");
        int tiempoActividad = sc.nextInt();
        
        //Variable
        double tasaMetabolica;
        
        //Condiciones
        if (actividad.equals("dormir")) {
            tasaMetabolica = 1.08;
        } else if (actividad.equals("sentado en reposo")) {
            tasaMetabolica = 1.66;
        } else {
            System.out.println("Actividad no válida");
            return;
        }
        
        //Resultado final
        double caloriasConsumidas = tiempoActividad * tasaMetabolica;
        
        System.out.println("Calorías consumidas: " + caloriasConsumidas);
    }
}
