package Maps_And_Sets;
import java.util.HashSet;
import java.util.Iterator;

public class Sets_STL {
    public static void main(String[] args) {
        // 1. Create a HashSet
        HashSet<String> set = new HashSet<>();

        // 2. Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate (ignored)

        System.out.println("HashSet after adding elements: " + set);

        // 3. Check size
        System.out.println("Size of HashSet: " + set.size());

        // 4. Check if element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));
        System.out.println("Contains 'Mango'? " + set.contains("Mango"));

        // 5. Remove an element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // 6. Iterate using for-each
        System.out.println("Iterating with for-each loop:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 7. Iterate using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 8. Check if empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // 9. Clone (shallow copy)
        HashSet<String> cloneSet = (HashSet<String>) set.clone();
        System.out.println("Cloned HashSet: " + cloneSet);

        // 10. Add all from another collection
        HashSet<String> moreFruits = new HashSet<>();
        moreFruits.add("Mango");
        moreFruits.add("Orange");
        set.addAll(moreFruits);
        System.out.println("After addAll(): " + set);

        // 11. Retain only common elements
        HashSet<String> retainSet = new HashSet<>();
        retainSet.add("Apple");
        retainSet.add("Mango");
        set.retainAll(retainSet);
        System.out.println("After retainAll(): " + set);

        // 12. Remove all elements from another collection
        set.removeAll(retainSet);
        System.out.println("After removeAll(): " + set);

        // 13. Clear entire set
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
