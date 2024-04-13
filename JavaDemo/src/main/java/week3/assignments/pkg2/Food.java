package week3.assignments.pkg2;

import week3.assignments.pkg1.Animal;

public class Food {
    public static void main(String[] args) {
        Animal a = new Animal("Human",20,"Indian",86553);
        System.out.println(a.name);
        // age cannot be accessed as it is private in Animal class
        // surname cannot be accessed as it is protected in Animal class
        // id cannot be access as it is default in Animal class
        a.eat();
        //a.gender(); cannot be accessed as it is private in Animal class
        //a.walk(); cannot be accessed as it is protected in Animal class
        //a.getDetails(); cannot be accessed as it is default in Animal class
    }
}
