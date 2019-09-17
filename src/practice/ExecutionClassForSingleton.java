package practice;

public class ExecutionClassForSingleton {

    public static void main(String[] args) {
        TestClassForSingleton testClassForSingleton = TestClassForSingleton.getInstance();
        TestClassForSingleton testClassForSingleton1 = TestClassForSingleton.getInstance();

        testClassForSingleton1. x =testClassForSingleton1.x.toUpperCase();

        System.out.println(testClassForSingleton.x);
        System.out.println(testClassForSingleton1.x);
    }
}
