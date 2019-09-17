package test;

public class Pyramid {
    //Implement a large Pyramid of stars in the screen with java.


   public static void main(String[] args) {



        for (int i=0; i<5; i++)
        {
            for (int j=5-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
            
            for (int j=0; j<=i; j++ )
            {

                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    }











