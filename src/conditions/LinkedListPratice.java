package conditions;

import java.util.LinkedList;

public class LinkedListPratice {

    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        linkedList.add("Mr r");
        linkedList.add("Mr t");

        for (int i =0;i<linkedList.size();i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());



        for (int i =0;i<linkedList.size();i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println(linkedList.get(0));

        linkedList.set(0,"Mr eww");
        System.out.println(linkedList.getFirst());

    }
}
