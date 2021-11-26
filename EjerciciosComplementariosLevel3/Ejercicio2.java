package com.complementarios;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        int potencia  = 2;
        List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5);
        List<Integer> listaDeNumerosPotenciados = listaDeNumeros.stream()
                .map(num -> calcularPotencia(num, potencia))
                .collect(Collectors.toList());
        System.out.println(listaDeNumerosPotenciados);
    }

    public static int calcularPotencia(int num, int potencia) {
            return potencia == 0 ? 1 : num * calcularPotencia(num, potencia-1);
    }
}
