package com.informatorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCity = 3;

        List<String> city = new ArrayList<>();

        for(int i = 0; i < numberOfCity; i++){
            System.out.print("Ehter city: ");
            city.add(scan.nextLine());

        }

        for(int i = 0; i < city.size(); i++){
            System.out.println(String.format("# %s - %s",(i+1), city.get(i)));
        }
        scan.close();

    }
}
