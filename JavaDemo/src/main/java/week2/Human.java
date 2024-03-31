package week2;

public class Human {

    private int age;
    private String name;

    public Human(){
        System.out.println("This is default constructor of class Human !");
    }
    public Human(String obj_name, int obj_age){
        age = obj_age;
        name = obj_name;
        System.out.println("This is parameterized constructor of class Human !");
    }

    public void getHumanDetails(){
        System.out.println("Name : "+name+", Age : "+age);
    }
    public void setName(String obj_name) {
        name = obj_name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int obj_age) {
        age = obj_age;
    }
}
