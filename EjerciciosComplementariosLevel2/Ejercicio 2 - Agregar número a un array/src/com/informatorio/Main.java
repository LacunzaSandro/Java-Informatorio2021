package com.informatorio;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInitial = 5;
        List <Integer> num = new ArrayList<>();

        for (int i = 0; i < sizeInitial; i++) {
            System.out.print("Enter a number: ");
            num.add(scan.nextInt());
        }


        showNumbers(num);
        showSiseList(num);

        System.out.println("Enter a number in the first position: ");
        num.add(0,scan.nextInt());

        System.out.println("Enter a number at the end of the list: ");
        num.add((num.size()),scan.nextInt());

        showNumbers(num);
        showSiseList(num);


    }

    private static void showNumbers(List num) {
        System.out.println("the list of number: ");
        for (int i = 0; i< num.size();i++){
            System.out.print("-"+ num.get(i) +"-");
        }
    }
    private static void showSiseList(List num) {
        System.out.println(String.format("\nThe number list size is: %s", num.size()));
    }

}
