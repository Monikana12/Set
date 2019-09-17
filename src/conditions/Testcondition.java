package conditions;

public class Testcondition {

    public static void main(String[] args) {

        //If Block
        int x = 9;
        if (x > 10) {
            System.out.println("x is greater than 10");
        }
        if (x < 10) {
            System.out.println("x is less than 10");
        }
        System.out.println("*********");

        //If Else Block

        int a =4;

        if(a>3) {
            System.out.println("a is greater than 3");
        }else {
            System.out.println("a is less than 3");
        }
        System.out.println("&&&&&");

        //Else If Block

        int b =5;

        if(b>5) {
            System.out.println("b is greater than 5");
        }else if (b==5){
            System.out.println("b is equals to 5");
        }else if (b<5) {
            System.out.println("b is less than 5");
        }
            System.out.println("%%%%%");

        // | -- Or
        // && -- And
        // ! --Not
        // != -- Not Equal

        int s =9;
    int t = 10;

        if(s  > 10 && t > 12) {
        System.out.println("we won");
    }else if (s == 12| t == 12){
        System.out.println("we lost");
    }else if (s !=12){
        System.out.println("nothing");
    }

}
    }

