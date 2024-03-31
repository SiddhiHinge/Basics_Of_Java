package week2.oopsconcepts;

public class OopDemo {

    public static void main(String[] args) {

        AnimalParent obj1 = new AnimalParent(1);
        //obj1.describe();
        DomesticAnimal obj2 = new DomesticAnimal();
        //obj2.describe();
        /*Encapsulation e = new Encapsulation();
        e.setNum(10);
        e.setStr("Encapsulation");
        Polymorphism p = new Polymorphism();
        p.method();
        p.method(12345);
        p.method("Polymorphism : Method Overloading");

        AnimalParent a = new AnimalParent();
        a.describe();

        DomesticAnimal dog = new DomesticAnimal();
        dog.describe();

        AnimalParent a1 = new DomesticAnimal();
        a1.describe();
        AnimalParent a2 = (AnimalParent) new DomesticAnimal();
        a2.describe();
        DomesticAnimal d1 = (DomesticAnimal) new AnimalParent();
        d1.describe();  RuntimeError - AnimalParent cannot be cast to class week2.oopsconcepts.DomesticAnimal
        instance of child cannot be used to create object of Parent class*/
    }

}
