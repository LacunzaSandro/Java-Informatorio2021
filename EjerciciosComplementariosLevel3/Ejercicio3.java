package com.complementarios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Entendi que tenían que ser permitidos los que tenian B o b
         */
        List<String> palabras = Arrays.asList("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Long count = palabras.stream()
                .filter(word -> word.startsWith("B") || word.startsWith("b"))
                .count();
        System.out.println(count);
    }
}
