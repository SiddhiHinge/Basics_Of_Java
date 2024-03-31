package week2.oopsconcepts;

public class DomesticAnimal extends AnimalParent{

    DomesticAnimal() {
        super(2);
        System.out.println("DomesticAnimal Constructor !");
    }
    public void describe(){
        System.out.println("Domestic Animal is living being");
    }
    public void eat(){
        System.out.println("Domestic Animal is eating");
    }
}
