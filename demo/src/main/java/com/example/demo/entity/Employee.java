package com.example.demo.entity;

public class Employee{

    private String name;

    private String department;



    public Employee() {

 

    }
    //建構式要能接受name department
    public Employee(final String name, final String department) {

      this.name = name;

      this.department = department;

    }



    public String getName() {

      return name;

    }



    public void setName(String name) {

      this.name = name;

    }



    public String getDepartment() {

      return department;

    }



    public void setDepartment(String department) {

      this.department = department;

    }



}