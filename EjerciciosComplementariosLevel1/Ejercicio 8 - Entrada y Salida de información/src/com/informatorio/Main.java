package com.informatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first name and last name: ");
        String name = scan.nextLine();
        System.out.print("Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Address: ");
        String address = scan.nextLine();
        System.out.print("City: ");
        String city = scan.nextLine();

        System.out.print("Datos personales: "+ city + " - " + address + " - " + age + " - " + name );
    }
}
