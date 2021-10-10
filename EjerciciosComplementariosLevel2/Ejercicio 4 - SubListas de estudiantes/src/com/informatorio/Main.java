package com.informatorio;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<String> student = new ArrayList<>();
        int numOfStudent = 12;

        for (int i = 0; i < numOfStudent; i++) {
            System.out.print("Ingrese nombre del estudiante: ");
            student.add(scn.next());
        }

        showList("Lista de 12 estudiantes: ",student);


        List <String> curso1 = student.subList(0,4);
        List <String> curso2 = student.subList(4,8);
        List <String> curso3 = student.subList(8,12);


       showList("Alumnos que pertenecen al curso 1: ", curso1);
       showList("Alumnos que pertenecen al curso 2: ", curso2);
       showList("Alumnos que pertenecen al curso 3: ", curso3);
    }

    private static void showList(String s, List list) {
        System.out.println(s);
        for (int i = 0; i<list.size();i++ ){
            System.out.println(list.get(i));
        }
    }
}
