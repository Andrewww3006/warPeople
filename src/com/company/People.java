package com.company;

public class People {
    private String name;
    private int age;
    private Sex sex;


    public People (String name, int age,Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public Sex getSex() {
        return sex;
    }
}
