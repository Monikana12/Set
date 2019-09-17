package conditions;

import java.util.ArrayList;

public class ArrayListP {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("Mr X");
        arrayList.add("Mr Z");

        System.out.println(arrayList.get(0));

        for(int i =0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        ArrayList<String> stringArrayList =new ArrayList<>();
        stringArrayList.add("john");
        stringArrayList.add("lala");
        for(int i =0;i<stringArrayList.size();i++) {
            System.out.println(stringArrayList.get(i));
        }
    }


    }

