package week1;

public class JavaDemo {
    public static void main(String[] Args) {
        //Find the Age stage from given age
        int age = 30;
        String gender = "Male";

        if(age<0){
            System.out.println("! Given Age not valid !");
        }else {
            if(gender!="Male" && gender!="Female"){
                System.out.println("! Given Gender not valid !");
            }
            else if(age>=0 && age<18) {
                if(gender == "Male") {
                    System.out.println("Child : Boy");
                }
                else {
                    System.out.println("Child: Girl");
                }
            }
            else if(age>=18 && age<60) {
                if(gender == "Male") {
                    System.out.println("Adult : Men");
                }
                else {
                    System.out.println("Adult: Women");
                }
            }
            else {
                System.out.println("Senior Citizen");
            }
        }

    }
}

/*System.out.println("Hello Siddhi");
int int_num = 10;
float float_num = 6f;
double double_num = 12.23;

System.out.println("Int : "+int_num);
System.out.println("Float : "+float_num);
System.out.println("Double : "+double_num);*/
