package basic;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("Factorial of 5 is : " + factorial(5));
    }
    
    public static int factorial(int bound) {
        int fact =1;
        for(int i =1; i<=bound;i++){
            fact = fact*i;
        }
        return fact;

    }
}
