package com.complementarios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = Arrays.asList(1, 2, 4, 4, 4);
        List<Integer> listFactorial = palabras.stream()
                .map(Ejercicio4::factorial)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listFactorial);
    }

    public static Integer factorial(Integer num) {
        return num == 1 ? 1 : num * factorial(num - 1);
    }
}
