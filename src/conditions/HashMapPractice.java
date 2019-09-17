package conditions;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"NYC");
        hashMap.put(2,"NJ");
        hashMap.put(3,"VA");


        System.out.println(hashMap);
        System.out.println(hashMap.size());

        System.out.println(hashMap.get(3));
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsKey(4));

        HashMap<String,Integer> hashMap1 =new HashMap<>();
        hashMap1.put("NYC",34);
        hashMap1.put("NJ",67);
        hashMap1.put("VA",90);
        System.out.println(hashMap1.containsKey("NYC"));

        //hashMap1.containsvalue()
        //hashMap1.put()

    }
}
