package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Dynamic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList studentList =new ArrayList();
        HashSet subjectList = new HashSet();

        System.out.println("how many students do you want to calculate?");
        int count =scanner.nextInt();

        for (int i=0;i<count;i++){
            ArrayList markList =new ArrayList();
            System.out.println("insert students name:");
            String student =scanner.next();
        for (int j =0; j<4; j++) {
            System.out.println("enter a subject:");
             String subject = scanner.next();
            System.out.println("enter a mark:");
            String mark =scanner.next();


        }
        }
    }
}
