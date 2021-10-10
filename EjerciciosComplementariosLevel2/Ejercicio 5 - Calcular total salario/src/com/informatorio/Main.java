package com.informatorio;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> hoursWorked = Arrays.asList(6, 7, 8, 4, 5);
        List <Integer> paymentHours = Arrays.asList(350, 345, 550, 600, 320);
        List<Integer> total = new ArrayList<>();

        System.out.println("Lista de horas: "+ hoursWorked);
        System.out.println("Lista de pago por hora: "+paymentHours);
        calculatePayment(hoursWorked, paymentHours, total);
        showTotal(total);
    }
    private static void showTotal(List<Integer> total) {
        int totalToPrint = 0;
        for (int i:total) {
            totalToPrint += i;
        }
        System.out.println("Lista de pagos por dia: " + total);
        System.out.println(String.format("Total Final: $ %s", totalToPrint));
    }
    private static void calculatePayment(List<Integer> hours, List<Integer> payment, List<Integer> total) {
        for (int i = 0; i < hours.size();i++){
            total.add(hours.get(i)*payment.get(i));
        }
    }
}
