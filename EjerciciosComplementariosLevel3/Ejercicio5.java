package com.complementarios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Homero", "Simpson",  LocalDate.of(1950, 12, 25)),
                new Alumno("March", "Simpson",  LocalDate.of(1960, 06, 22)),
                new Alumno("Bart", "Simpson",  LocalDate.of(1985, 07, 05)),
                new Alumno("Lisa", "Simpson",  LocalDate.of(1990, 03, 28)),
                new Alumno("Maggi", "Simpson",  LocalDate.of(2000, 11, 01)),
                new Alumno("Montgomery", "Burns",  LocalDate.of(1920, 12, 03))
        );
        Map<String, Integer> alumnosConEdades = alumnos.stream()
                .collect(Collectors
                        .toMap(Ejercicio5::getFullName,Ejercicio5::getAge));
        System.out.println(alumnosConEdades);
    }
    public static String getFullName(Alumno alumno) {
        return alumno.getFirsName() + " " + alumno.getLastName();
    }
    public static Integer getAge(Alumno alumno){
        return Period.between(alumno.getBirthday(), LocalDate.now()).getYears();
    }
}
