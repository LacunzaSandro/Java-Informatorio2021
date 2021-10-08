package com.informatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 1;
        System.out.print("Ingrese el numero base: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el exponente: ");
        int b = scan.nextInt();

        for (int i = 1; i<= b; i++){
            result = result * a;
        }
        System.out.println(String.format("%s elevado a %s = %s ", a,b, result));

    }
}
