package week2;

public class Reptile {

    public static void main(String args[]) {
        String name = "Snake";
        String colour = "Red";
        Reptile snake = new Reptile();
        snake.printInfo(name,colour);
    }
    public void printInfo(String name, String colour){
        if(colour == "Red"){
            System.out.println(name+" is dangerous reptile as its colour is "+colour);
        }
        else{
            System.out.println(name+" is reptile & its colour is "+colour);
        }
    }
}
