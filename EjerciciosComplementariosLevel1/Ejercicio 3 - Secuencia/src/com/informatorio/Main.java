package com.informatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int num = scan.nextInt();

        for (int i = 1; i<= num; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scan.close();
    }
}
