package week3.assignments.pkg2;

import week3.assignments.pkg1.Animal;

public class Lion extends Animal{
    Lion() {
        super("Lion",32,"Indian",86904);
    }

    public static void main(String[] args) {
        Animal lion = new Lion();
        System.out.println(lion.name);
        // age cannot be accessed as it is private in Animal class
        // surname cannot be accessed as it is protected in Animal class
        // id cannot be access as it is default in Animal class
        lion.eat();
        //lion.gender(); cannot be accessed as it is private in Animal class
        //lion.walk(); cannot be accessed as it is protected in Animal class
        //lion.getDetails(); cannot be accessed as it is default in Animal class
    }
}
