package com.company;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<People>people=new ArrayList<People>(Arrays.asList(new People("Вася", 18, "man"), new People("Петя", 23, "man"),
                new People("Елена", 42, "woman"), new People("Иван Иванович", 69, "man")));
        people.stream().filter(s->s.getAge()>=18).filter(s->s.getAge()<27).forEach(s-> System.out.print(s.getName() + ", "));
    }
}
