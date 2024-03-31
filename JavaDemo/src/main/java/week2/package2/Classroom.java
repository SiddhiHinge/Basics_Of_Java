package week2.package2;

import week2.package1.Teacher;

public class Classroom {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        // Student s1 = new Student(); Cannot access class which is in different package and is default
        t1.c = 10;
        //t1.a = 11; Cannot access as the a variable is default access & in different package
        //t1.b = 12; Cannot access as the b variable is private access & in different package
        //t1.d = 13; Cannot access as the d variable is protected access & is not inherited
    }
}
