package week3.assignments.pkg1;

public class Animal {
    public String name;
    private int age;
    protected String surname;
    int id;
    public Animal(String name1, int age1, String surname1, int id1){
        name = name1;
        age = age1;
        surname = surname1;
        id = id1;
        System.out.println("Inside Animal parameterized constructor");
    }
    public void eat() {
        System.out.println("Animal >> Eat");
    }
    private void gender(){
        System.out.println("Animal >> Gender");
    }
    protected void walk(){
        System.out.println("Animal >> Walk");
    }
    void getDetails(){
        System.out.println("Animal >> Details");
    }
}
