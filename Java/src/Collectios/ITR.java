package Collectios;

import java.util.*;

public class ITR {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(10);
        l.add("Shubham");
        l.add(12.2);
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator litr = l.listIterator();
        System.out.println("Forword iterator:");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("\nBackword iterator:");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        Stack list = new Stack();
        list.add(2);
        list.add("shubham");
        list.add(12.3);
        Enumeration eitr = list.elements();
        while(eitr.hasMoreElements()){
            System.out.println(eitr.nextElement());
        }

    }
}
