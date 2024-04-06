package week3.interfaceDemo;

public class MobileObj {

    public static void main(String[] args) {

        Mobile galaxy = new Samsung();
        galaxy.camera();
        galaxy.memory();
        Mobile iPhone = new Apple();
        iPhone.camera();
        iPhone.memory();

        // galaxy.mobile() cannot call this method of Samsung class as it is not methof of interface Mobile which is inteface
        // iPhone.mobile() cannot call this method of Samsung class as it is not methof of interface Mobile which is inteface

        Samsung flip = new Samsung();
        Apple ipad = new Apple();
        flip.mobile();
        ipad.mobile();
    }
}
