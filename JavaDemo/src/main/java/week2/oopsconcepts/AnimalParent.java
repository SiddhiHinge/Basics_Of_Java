package week2.oopsconcepts;

public class AnimalParent {

    /*public AnimalParent(){
        System.out.println("Animal Constructor !");
    }*/
    public AnimalParent(int a){
        System.out.println("Animal Paramether Constructor ! "+a);
    }
    public void describe(){
        System.out.println("Animal is living being");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}
