package com.informatorio;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer,Integer > sueldos = new HashMap<>();

        empleados.add(new Empleado("Alberto",36847546,8,150 ));
        empleados.add(new Empleado("Juan",56214268,9,100));
        empleados.add(new Empleado("Luana", 32962456, 6,200));
        empleados.add(new Empleado("Pablo", 35894214,5,350));


        for (Empleado e : empleados){
            sueldos.put(e.getDni(),e.getHoursWorked() * e.getPaymentHours());
        }
        System.out.println(sueldos);
    }
}
