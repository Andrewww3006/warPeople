package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<People>people=new ArrayList<People>(Arrays.asList(new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN), new People("Иван Иванович", 69, Sex.MAN)));
        System.out.println("Военнообязонными являются:");
        people.stream().filter(s->s.getAge()>=18).filter(s->s.getAge()<27).filter(s->s.getSex()==Sex.MAN).
                forEach(s-> System.out.print(s.getName() + ", "));
        System.out.println("Средний возраст мужчин:");
       long manCount = people.stream().filter(s->s.getSex()==Sex.MAN).count();
       double manAverageAge = people.stream().filter(s -> s.getSex() == Sex.MAN).mapToInt(People::getAge).sum();
       System.out.println(manAverageAge/manCount);

        System.out.println("Кол-во потенциально работоспособных людей в выборке:");
long workingPeople = people.stream().filter(s->s.getAge()>=18).filter(s->s.getSex()==Sex.WOMAN&&s.getAge()<55||
                s.getSex()==Sex.MAN&&s.getAge()<60).count();
        System.out.println(workingPeople);
        people.stream().filter(s->s.getAge()>=18).filter(s->s.getSex()==Sex.WOMAN&&s.getAge()<55||
                s.getSex()==Sex.MAN&&s.getAge()<60).forEach(s-> System.out.println(s.getName()));

        Collection ordered = Arrays.asList("a9", "a8", "a2", "a3", "a1", "a2", "a1");
        Collection nonOrdered = new HashSet<>(ordered);
        ordered.stream().forEach(System.out::println);
        nonOrdered.stream().forEach(System.out::println);
    }
}
