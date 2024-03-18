package Collections.Theory;

import java.util.Stack;

public class LearnStack{

    public static void main(String[] args) {
//        Stack<String> animals= new Stack<>();
//
//        animals.push("Lion");
//        animals.push("Dog");
//        animals.push("Horse");
//        animals.push("Cat");
//
//        System.out.println("Stack: " + animals);
//
//        System.out.println(animals.peek());
//
//        animals.pop();
//
//        System.out.println("Stack: " + animals);
//
//        System.out.println(animals.peek());
        Stack<Integer> books = new Stack<>();
        books.push(2);
        books.push(4);
        books.push(9);

        System.out.println(books);

        books.pop();
        System.out.println(books);
        System.out.println(books.isEmpty());
        System.out.println(books.size());
        System.out.println(books.peek());
        books.clear();

    }
}