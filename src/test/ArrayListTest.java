package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {

        /*
         * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */


        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("land");
        arrayList.add("newyork");
        arrayList.add("korea");
        arrayList.add("Qa");

        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i)+" ");
        }


       arrayList.remove("Qa");


        Iterator it = arrayList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());


        }
    }

}
