package week2;

public class DemoClass {

    public static void main(String args[]) {

        Human harry = new Human();
        harry.setName("Harry");
        harry.setAge(25);
        harry.getHumanDetails();

        Human ron = new Human("Ron",28);
        ron.getHumanDetails();
    }
}
