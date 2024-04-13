package week3.assignments.pkg1;

public class Dog extends Animal{
    //Gives error if constructor not added in Dog as Animal class has parameterized constructor
    Dog() {
        super("Dog",12,"Indian",365789);
        System.out.println("Inside Dog()");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.name+" "+dog.surname+" "+dog.id); // age cannot be accessed as it is private in Animal class
        dog.eat();
        //dog.gender(); cannot be accessed as it is private in Animal class
        dog.walk();
        dog.getDetails();
    }
}
