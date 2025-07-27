package collections;

import java.util.*;

public class SetMethods {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> fruits = new HashSet<>();

        // 1. add(element)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate, won't be added

        // 2. size()
        System.out.println("Size: " + fruits.size()); // 3

        // 3. contains(element)
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // 4. isEmpty()
        System.out.println("Is Empty? " + fruits.isEmpty());

        // 5. remove(element)
        fruits.remove("Banana");

        // 6. iterator()
        System.out.println("Using Iterator:");
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 7. forEach()
        System.out.println("Using forEach:");
        fruits.forEach(System.out::println);

        // 8. toArray()
        Object[] array = fruits.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 9. addAll()
        Set<String> newFruits = new HashSet<>(Arrays.asList("Mango", "Papaya"));
        fruits.addAll(newFruits);
        System.out.println("After addAll: " + fruits);

        // 10. containsAll()
        boolean hasAll = fruits.containsAll(Arrays.asList("Apple", "Mango"));
        System.out.println("Contains All [Apple, Mango]? " + hasAll);

        // 11. removeAll()
        fruits.removeAll(Collections.singleton("Apple"));
        System.out.println("After removeAll 'Apple': " + fruits);

        // 12. retainAll()
        fruits.retainAll(Collections.singleton("Mango"));
        System.out.println("After retainAll 'Mango': " + fruits);

        // 13. clear()
        fruits.clear();
        System.out.println("After clear, is empty? " + fruits.isEmpty());

        // 14. equals()
        Set<String> set1 = new HashSet<>(Arrays.asList("One", "Two", "Three"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Three", "One", "Two"));
        System.out.println("Is Equal? " + set1.equals(set2));
    }
}
