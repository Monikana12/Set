package conditions;

public class Loops {

    public static void main(String[] args) {

        //for Loops
         //Loopcondition
        //for(datatype variable = whereToStart;whereToFinish;Increment/Decrement)

        for (int a = 0; a < 5; a++) {
            System.out.println("book");
        }
        for (int a = 0; a < 5; a++) {
            System.out.println(a + "book");
        }

        //for (int b = 0; b < 6; b--) {
           // System.out.println("world");

      //Inner for loop
      // print selenium 5 times,and for each time you print selenium,print java 2 times

      for (int x =0;x<5;x++)  {
          System.out.println("selenium");
          for (int z=0;z<2;z++) {
              System.out.println("java");
          }
      }


        //while loop

        int x =0;
        while (x<6){
            System.out.println("java book");
            x++;
        }

        int X =0;
        while (X<6){
            System.out.println( X+ "java book");
            X++;
        }

        // Do While loop
        int s= 0;
        do {
            System.out.println("i hate java");
            s++;
        }
        while(s<5);
    }

}
