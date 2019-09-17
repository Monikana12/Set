package conditions;

import java.util.ArrayList;

public class ArraylistR {


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        //index

        arrayList.add("Mr k");
        arrayList.add("Mr o");

        for(int i =0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());

        arrayList.remove(1);

        for(int i =0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));

        arrayList.clear();
        System.out.println(arrayList.size());
    }



}



