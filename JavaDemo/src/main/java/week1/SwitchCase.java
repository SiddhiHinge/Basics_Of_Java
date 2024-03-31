package week1;

public class SwitchCase {
    public static void main(String[] args) {
        int feedback = 1;
        switch(feedback) {
            case 1: {
                System.out.println("Not good");
                break;
            }
            case 2: {
                System.out.println("Need improvement");
                break;
            }
            case 3: {
                System.out.println("OK");
                break;
            }
            case 4: {
                System.out.println("Good");
                break;
            }
            case 5: {
                System.out.println("Very good");
                break;
            }
            default: {
                System.out.println("Did you attend the class ?!");
                break;
            }
        }
    }
}

/*switch(gender) {

        case 'M': {
        System.out.println("Gender : Male");
                break;
                        }
                        case 'F': {
                        System.out.println("Gender : Female");
                break;
                        }
                        case 'T': {
                        System.out.println("Gender : Transgender");
                break;
                        }
default: {
        System.out.println("! Wrong input !");
            }
                    }*/


