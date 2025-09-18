package Collectios;

import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Shubham");
        list.add(true);
        list.add(12.5);
        System.out.println(list);
//        for(int i = 0;i < list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for(Object i :list){
//            System.out.println(i);
//        }
        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(0,122);
        list1.addAll(list);
        System.out.println(list1);
    }
}
