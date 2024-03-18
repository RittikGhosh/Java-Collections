package Collections.Theory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {

//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(12);
//        queue.offer(24);
//        queue.offer(36);
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.peek());

        Queue<Integer> students = new LinkedList<>();
        students.offer(2);
        students.offer(1);
        students.offer(4);
        students.offer(33);
        students.offer(5);

        System.out.println(students);
        System.out.println(students.poll());
        System.out.println(students);
        System.out.println(students.peek());
        System.out.println(students.size());
        System.out.println(students.isEmpty());

        Iterator<Integer> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        students.clear();
        System.out.println(students);

    }
}