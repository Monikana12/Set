package string;

public class Convert {

    public static void testMethod() throws Exception{

    }

    public static void main(String[] args)  {

        try{
            testMethod();
        }catch (Exception e){
            e.printStackTrace();
        }

        String a="10";

        //using Integer.valueOf()
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        //using Integer.parseInt()
        int c = Integer.parseInt(a);
        System.out.println(c);

        //NumberFormatException

        String x ="12a";
        try {
            Integer y = Integer.valueOf(x);
            System.out.println(y);
        } catch (NumberFormatException ee) {
            System.out.println("number");
        }
    }
}
