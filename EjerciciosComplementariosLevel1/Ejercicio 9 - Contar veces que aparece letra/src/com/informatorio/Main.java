package com.informatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0 ;

        System.out.print("Enter text: ");
        String tex = scan.nextLine();
        System.out.print("Enter char to find and count: ");
        char c = scan.next().charAt(0);

        for (int i = 0; i < tex.length(); i++){
            if (tex.charAt(i) == c){
                cont++;
            }
        }

        System.out.println(String.format("Cantidad de veces encontradas: %s", cont));
        scan.close();
    }
}
