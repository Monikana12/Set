package basic;

public class OuterClass {


    String x ="names";

    public void method1() {
        System.out.println(x);
    }

    InnerClass1 innerClass1 =new InnerClass1();

    public static void main(String[] args) {
        OuterClass outerClass =new OuterClass();
        //outerClass.z();

    }
    private class InnerClass1 {

        String z ="result";
        public void printInnerClass() {
            System.out.println(z);
        }

    }
}






