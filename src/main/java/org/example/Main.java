package org.example;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> fruits = Lists.newArrayList("orange", "banana", "kiwi");
        System.out.println("Original list:");
        fruits.forEach(System.out::println);
        List<String> reverseFruits = Lists.reverse(fruits);
        System.out.println("\nReversed list:");
        reverseFruits.forEach(System.out::println);
        Multimap<String, String> map = ArrayListMultimap.create();
        map.put("key", "firstValue");
        map.put("key", "secondValue");
        System.out.println("\nMultimap:");
        System.out.println(map);
    }
}