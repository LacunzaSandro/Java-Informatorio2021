package com.informatorio;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Número de inicio: ");
        int start = scan.nextInt();

        System.out.print("Número final: ");
        int end = scan.nextInt();
        if (start < end) {
            List <String> resultado = CreateArray(start,end);
            System.out.print(resultado);
        } else {
            System.out.println("El primer valor ingresado debe ser menor al segundo.");
        }



    }

    public static String Compare(int i){
        if ( i % 2 == 0 && i % 3 == 0) return "FizzBuzz";
        else if ( i % 3 == 0 ) return "Buzz";
        else if ( i % 2 == 0 ) return "Fizz";
        else return String.valueOf(i);
    }

    public static List CreateArray(int start, int end){
        List <String> list = new ArrayList<>();
        for (int i = start; i < end; i++){
            list.add(Compare(i));
        }
        return list;
    }

}
