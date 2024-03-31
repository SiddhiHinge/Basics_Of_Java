package week2;

public class Animal {
    public static void main(String args[]){
        String name = "Tiger";
        Animal animal1 = new Animal();
        animal1.printName(name);
    }
    public void printName(String name) {
        System.out.println("week2.Animal is "+name);
    }
}
