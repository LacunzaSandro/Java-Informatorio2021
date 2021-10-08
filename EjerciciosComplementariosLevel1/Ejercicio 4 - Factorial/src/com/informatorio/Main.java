package com.informatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar el número: ");
        int a = scan.nextInt();
        System.out.println(String.format("El factorial de %s es %s", a, factorial(a)));
    }

    public static int factorial(int n) {
       if (n == 1) {
           return n;
       } else {
           return (n * factorial(n - 1));
       }
    }
}
