package conditions;

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<Integer,String>hashMap =new HashMap<>();

        hashMap.put(1,"va");
        hashMap.put(2,"Ny");
        hashMap.put(3,"NJ");

        System.out.println(hashMap);
        System.out.println(hashMap.size());

        System.out.println(hashMap.get(3));
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsKey(4));

        HashMap<String,Integer>hashMap1 =new HashMap<>();

        hashMap1.put("NY",56);
        hashMap1.put("VA",89);
        hashMap1.put("NJ",78);
        System.out.println(hashMap1.containsKey("NY"));
    }
}
