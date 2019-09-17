package basic;

public class Codes {

    public static void main(String[] args) {
        //for Loops
        //Loopcondition
        //for(datatype variable = whereToStart;whereToFinish;Increment/Decrement)

        for (int m =0; m<9;m++) {
            System.out.println("kona");
        }
        for (int y=0; y<6; y++) {
            System.out.println(y +"veer");
        }

        //Inner for loop
        // print selenium 5 times,and for each time you print selenium,print java 2 times

    for (int t=0; t<5;t++) {
        System.out.println("selenium");
    for (int r=0;r<2;r++) {
        System.out.println("java");
    }
    }

        //while loop
    int w=0;
    while (w<7) {
        System.out.println("dear");
        w++;
    }
    int b=0;
    while (b<2) {
        System.out.println(b + "we");
        b++;
    }

        // Do While loop

    int k =0;
    do {
        System.out.println("don't know");
        k++;
    }
    while(k<5);

        // Enhance for loop

        int [] id ={99,66,90,55};

        for (int q:id) {
            System.out.println(q);
        }



    }}
