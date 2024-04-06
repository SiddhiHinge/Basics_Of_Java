package week3.abstractDemo;

public class Tata extends Car{
    public void engine() {
        System.out.println("Tata Company engine..");
    }

    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.engine();
        tata.carName("Tata Hexa");
    }
}
