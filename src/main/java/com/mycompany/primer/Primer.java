package com.mycompany.primer;
import java.util.Scanner;

public class Primer {
    
    public static void main(String[] args) {
        
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe el titulo:");

        var titulo = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + usuario);
    }
}
