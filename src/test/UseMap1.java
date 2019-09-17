package test;

import java.util.*;

public class UseMap1 {

    public static void main(String[] args) {

        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> map = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Map<String, List<String>> map = new HashMap<>();

        List<String>mapOfstateOfUSA = new ArrayList<>();
        List<String>mapOfstateOfCANADA = new ArrayList<>();

        mapOfstateOfUSA.add("New York");
        mapOfstateOfCANADA.add("Ontario");

        map.put("USA",mapOfstateOfUSA);
        map.put("CANADA", mapOfstateOfCANADA);

        System.out.println(map);
        System.out.println(map.size());

        for ( int i=0; i<map.size();i++)  {
            System.out.println(map.get(i) + " ");
        }

        Iterator it =map.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }





    }
}
