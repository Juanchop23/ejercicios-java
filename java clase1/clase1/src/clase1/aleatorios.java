/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Random;

/**
 *
 * @author Sala403-3
 */
public class aleatorios {

    public static void main(String[] args) {
        //Variables
        float a, b, c;

        //Randomizador
        Random rnd = new Random();

        //Condiciones de no exceder el 10
        /*
        a = (rnd.nextFloat() * 10);
        b = (rnd.nextFloat() * 10);
        c = (rnd.nextFloat() * 10);
         */
        
        a = rnd.nextInt(101);
        b = rnd.nextInt(101);
        c = rnd.nextInt(101);

        //Mostrando la info
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
