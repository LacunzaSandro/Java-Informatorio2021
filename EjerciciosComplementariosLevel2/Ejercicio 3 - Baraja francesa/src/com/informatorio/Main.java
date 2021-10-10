package com.informatorio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int numPorFigura = 13;
        int numFigura = 4;
        List<Integer> baraja = new ArrayList<>();

        for (int i = 1; i <= numFigura; i++) {
            for (int j = 1; j <= numPorFigura; j++) {
                baraja.add(j);
            }
        }
        showArray("baraja recién ingresada: ",baraja);
        Collections.reverse(baraja);
        showArray("baraja en sentido reverso: ",baraja);
        Collections.shuffle(baraja);
        showArray("baraja mezclada: ",baraja);

    }
    private static void showArray(String s, List<Integer> baraja) {
        System.out.print(s);
        for (int e: baraja) {
            System.out.print("-"+e+"-");
        }
        System.out.println("");
    }
}
