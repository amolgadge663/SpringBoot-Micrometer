package com.amolsoftwares.www.springbootmicrometer.controller;

import lombok.*;

@Data
public class Employee {
    private int id;
    private String name;
    private String role;

    Employee(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
    }


}
