package Collections.Theory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

    public static void main(String[] args) {

        Map<Integer, String> numbers = new HashMap<>();
        Map<Integer, String> numbers1 = new TreeMap<>();
//        Map<Integer, String> numbers = new LinkedHashMap<>();

        numbers.put(1,"One");
        numbers.put(9,"five");
        numbers.put(5,"five");
        numbers1.put(1,"ele");
        numbers1.put(5,"nine");
        numbers1.put(9,"nine");

//        numbers.remove(3);

//        if(!numbers.containsKey("Two")) {
//            numbers.put("Two", 23);
//        }

//        numbers.putIfAbsent("Two", 23);
        System.out.println(numbers);
        System.out.println(numbers1);
        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.containsKey(3));

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.getOrDefault(3,"three"));

//        for (Map.Entry<String, Integer> e: numbers.entrySet()) {
//            System.out.println(e);
//
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }


        for(Integer k : numbers.keySet()){
            System.out.print(k+" ");
        }
//
//        for(Integer value: numbers.values()) {
//            System.out.println(value);
//        }

    }
}