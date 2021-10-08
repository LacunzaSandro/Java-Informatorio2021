package com.informatorio;

import sun.invoke.empty.Empty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] min = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] may = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        System.out.print("Ingres su texto: ");
        String texto = scan.nextLine();


        String textToUpperCase = "";

        for (int i = 0; i < texto.length(); i++){
            char c = '\0';
            for(int j = 0; j < min.length; j++){
                c = texto.charAt(i);
                if(texto.charAt(i) == min[j]){
                    c = may[j];
                    break;
                }
            }
            textToUpperCase += c;
        }

        System.out.println(textToUpperCase);
        scan.close();
    }

}
