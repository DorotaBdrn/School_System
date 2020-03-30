package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Teacher anna = new Teacher(1, "Anna", 400);
        Teacher peter = new Teacher(2, "Petter", 450);
        Teacher kate = new Teacher(3, "Kate", 500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(anna);
        teacherList.add(peter);
        teacherList.add(kate);
        System.out.println(teacherList);

        Student david = new Student(1, "David", 3);
        Student celine = new Student(2, "Celine", 1);
        Student blanca = new Student(3, "Blanca", 4);
        Student betty = new Student(4, "Betty", 3);
        Student tom = new Student(5, "Tom", 2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(david);
        studentList.add(celine);
        studentList.add(blanca);
        studentList.add(betty);
        studentList.add(tom);


        School highSchool = new School(teacherList, studentList);

        Teacher megan = new Teacher(4, "Megan", 500);

        highSchool.addTeacher(megan);


        david.payFees(4000);
        betty.payFees(5000);
        blanca.payFees(5000);
        highSchool.getTotalMoneyEarned();
        System.out.println("HighSchool eared " + highSchool.getTotalMoneyEarned());


        System.out.println("-------- S a l a r y -------");
        anna.recivedSalary(anna.getSalary());
        System.out.println("HighSchool has spent for salary " + anna.getName() + anna.getSalary() + "$ and now has " + highSchool.getTotalMoneyEarned());
        peter.recivedSalary(peter.getSalary());
        System.out.println("HighSchool has spent for salary " + peter.getName() + peter.getSalary() + "$ and now has " + highSchool.getTotalMoneyEarned());
        peter.recivedSalary(peter.getSalary());
        System.out.println("HighSchool has spent for salary " + peter.getName() + peter.getSalary() + "$ and now has " + highSchool.getTotalMoneyEarned());
        System.out.println(peter.getName() + " earned " + peter.getSalaryInTotal());
        System.out.println(anna.getName() + " earned " + anna.getSalaryInTotal());
        System.out.println(kate.getName() + " earned " + kate.getSalaryInTotal());
        anna.recivedSalary(anna.getSalary());
        System.out.println("HighSchool has spent for salary " + anna.getName() + anna.getSalary() + "$ and now has " + highSchool.getTotalMoneyEarned());
        System.out.println(anna.getName() + " earned " + anna.getSalaryInTotal());
        kate.recivedSalary(kate.getSalary());
        System.out.println("HighSchool has spent for salary " + kate.getName() + kate.getSalary() + "$ and now has " + highSchool.getTotalMoneyEarned());
        System.out.println(kate.getName() + " earned " + kate.getSalaryInTotal());


    }
}
