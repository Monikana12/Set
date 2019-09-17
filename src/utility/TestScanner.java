package utility;

import java.util.Scanner;

public class TestScanner {

    public static int calculator (int x,int y) {

        Scanner scanner =new Scanner(System.in);
         int a =x+y;
        return a;
    }

    public static void main(String[] args) {
        int result = calculator(11,12);
        System.out.println(result);
    }


    }

