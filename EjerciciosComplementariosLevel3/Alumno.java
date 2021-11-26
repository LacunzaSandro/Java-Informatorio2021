package com.complementarios;

import java.time.LocalDate;

public class Alumno {
    private String firsName;
    private String lastName;
    private LocalDate birthday;

    public Alumno(String firsName, String lastName, LocalDate birthday) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFirsName() {
        return firsName;
    }
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
