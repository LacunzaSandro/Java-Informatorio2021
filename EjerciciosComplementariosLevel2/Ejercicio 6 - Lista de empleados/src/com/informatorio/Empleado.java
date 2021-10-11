package com.informatorio;

public class Empleado {
    String nombre;
    int dni;
    int hoursWorked;
    int paymentHours;


    public Empleado (String nombre, int dni, int hoursWorked,int paymentHours){
        this.nombre = nombre;
        this.dni = dni;
        this. hoursWorked = hoursWorked;
        this.paymentHours = paymentHours;
    }




    @Override
    public String toString() {
        return  String.format("Empleado %s DNI: %s trabajo %s horas con un valor de: %s, nombre, dni, hoursWorked, paymentHours");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getPaymentHours() {
        return paymentHours;
    }

    public void setPaymentHours(int paymentHours) {
        this.paymentHours = paymentHours;
    }
}
