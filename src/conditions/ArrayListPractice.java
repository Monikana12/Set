package conditions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("NY");
        arrayList.add("NJ");
        arrayList.add("VA");

        //for Loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + " ");
        }
        // using Iterator
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
