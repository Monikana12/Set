package conditions;

public class Loop {

    public static void main(String[] args) {

        //for Loops
        //Loopcondition
        //for(datatype variable = whereToStart;whereToFinish;Increment/Decrement)
        for (int a = 0; a < 5; a++) {
            System.out.println("world");
        }
        for (int b = 0; b < 4; b++) {
            System.out.println(b + "hi");
        }

        //Inner for loop
        // print selenium 5 times,and for each time you print selenium,print java 2 times

        for (int c = 0; c < 5; c++) {
            System.out.println("selenium");
            for (int d = 0; d < 2; d++) {
                System.out.println("java");
            }
        }

     //while loop

        int q =0;
        while (q<7) {
            System.out.println("veer");
            q++;
        }
        int k =0;
        while (k<6){
            System.out.println(k+"Riya");
            k++;
        }

        // Do While loop

        int j =0;
        do {
            System.out.println("i don't like java");
            j++;
        }
        while(j<5) ;

        // Enhance for loop

        int [] ID ={223,55,667,889};

        for(int w:ID) {
            System.out.println(w);
        }


    }}