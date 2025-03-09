// Collections
// List - ArrayList, LinkedList
// Set - HashSet, LinkedHashSet, TreeSet
// Map - HashMap, LinkedHashMap, TreeMap
// Queue - PriorityQueue

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LessonSeven {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // ArrayList operations
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");

        list.remove(2); // O(n) because removing from the middle shifts elements
        list.set(2, "kiwi"); // O(1) as it directly replaces a value at an index

        list.add(0, "mango"); // O(n) because adding at the beginning shifts all elements to the right

        // Printing the ArrayList
        System.out.println(list);

        // LinkedList operations
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("grape");

        linkedList.remove(2); // O(n) because finding the node at index 2 requires traversal
        linkedList.set(2, "kiwi"); // O(n) due to traversal to the index

        linkedList.add(0, "mango"); // O(1) as adding at the beginning only adjusts pointers

        // Printing the LinkedList
        System.out.println(linkedList);

        linkedList.clear();

        // PriorityQueue operations
        priorityQueue.add("apple");
        priorityQueue.add("banana");
        priorityQueue.add("orange");
        priorityQueue.add("grape");

        // Note: PriorityQueue does not follow FIFO. It orders elements based on their
        // natural ordering or a comparator.
        priorityQueue.offer("mango");

        // poll() retrieves and removes the head of the queue, which is the smallest
        // element
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        // Hash Map
        // Key-Value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        map.put("grape", 4);

        Integer count = map.get("apple");

        System.out.println(count);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        // LinkedHashMap
        // Maintains the order of insertion
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("apple", 1);
        lhm.put("banana", 2);
        lhm.put("orange", 3);
        lhm.put("grape", 4);

        System.out.println(lhm.keySet());
        System.out.println(lhm.values());
        System.out.println(lhm.entrySet());

        // TreeMap
        // Maintains the order of keys
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("apple", 1);
        tm.put("banana", 2);
        tm.put("orange", 3);
        tm.put("grape", 4);

        tm.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });

        // Hash Set
        // Does not allow duplicates
        Set<String> hs = new HashSet<>();

        hs.add("apple");
        hs.add("banana");
        hs.add("orange");
        hs.add("apple");

        System.out.println(hs);

        // LinkedHashSet
        // Maintains the order of insertion

        Set<String> lhs = new LinkedHashSet<>();

        lhs.add("apple");
        lhs.add("banana");
        lhs.add("orange");
        lhs.add("apple");

        System.out.println(lhs);

        // TreeSet
        // Maintains the order of keys
        Set<String> ts = new TreeSet<>();

        ts.add("apple");
        ts.add("banana");
        ts.add("orange");
        ts.add("apple");

        System.out.println(ts);

        // Other methods

        // Sorting
        Collections.sort(list);

        // Reversing
        Collections.reverse(list);

        // Shuffling
        Collections.shuffle(list);

        // Swapping
        Collections.swap(list, 0, 1);

        // Swap the first and last elements
        Collections.swap(list, 0, list.size() - 1);

        // Binary Search result
        int index = Collections.binarySearch(list, "banana");

        System.out.println(index);

        // Max and Min
        String max = Collections.max(list);
        String min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);

        // Frequency
        int freq = Collections.frequency(list, "apple");

        System.out.println(freq);

        //Fill
        Collections.fill(list, "kiwi");

    }
}
