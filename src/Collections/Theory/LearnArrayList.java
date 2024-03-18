package Collections.Theory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        //LinkedList has same fns as ArrayList when implemented through List interface
        //The difference is arraylist is stored in contigous manner whereas linkedlist can be stored in fragmented memory
        //the methods like set,remove has TC of O(n)
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
        System.out.println(list);

        List<Integer> newList = new ArrayList<>(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);

        System.out.println(list.get(1));


        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(1,300);

        System.out.println(list2.toString());

        for (int i = 0; i < list2.size(); i++) {
            System.out.println("the element is " + list2.get(i));
        }

        for (Integer element: list2) {
            System.out.println("foreach element is " + element);
        }


        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            System.out.println("iterator = "+it.next());
        }
        list2.set(1, 3000);

        System.out.println(list2);

        System.out.println(list2.contains(500));

        list2.remove(1);  // This will remove the element at index 1 i.e 3000.
        System.out.println(list2);

        list2.remove(Integer.valueOf(30)); // This will remove 30 from the list
        System.out.println(list2);

        list2.clear(); //This will remove all the elements from the list.
        System.out.println(list2);



    }
}