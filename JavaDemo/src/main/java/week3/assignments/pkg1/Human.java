package week3.assignments.pkg1;

public class Human {
    public static void main(String[] args) {
        Animal a = new Animal("Tiger",30,"Indian",18765);
        System.out.println(a.name+" "+a.surname+" "+a.id);
        // age cannot be accessed as it is private in Animal class
        a.eat();
        // a.gender(); cannot be accessed as it is private in Animal class
        a.walk();
        a.getDetails();
    }
}
