package com.informatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();

        for (int i = 1; i<=b; i++){
            result += a;
        }
        System.out.println( String.format("Si multiplicamos %s * %s el resultado es: %s", a, b , result));
    }
}
