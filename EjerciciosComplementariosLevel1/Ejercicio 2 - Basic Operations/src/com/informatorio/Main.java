package com.informatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scan.nextInt();
        System.out.println("Input second number: ");
        int b = scan.nextInt();
        System.out.println(String.format("%s + %s = %s", a,b, (a+b)));
        System.out.println(String.format("%s - %s = %s", a,b, (a-b)));
        System.out.println(String.format("%s * %s = %s", a,b, (a*b)));
        System.out.println(String.format("%s / %s = %s", a,b, (a/b)));
        System.out.println(String.format("%s resto %s = %s", a,b, (a%b)));


        scan.close();
    }
}
