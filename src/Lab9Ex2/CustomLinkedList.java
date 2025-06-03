package Lab9Ex2;

import java.util.*;

public class CustomLinkedList extends LinkedList<Integer> {
    private int totalElementsAdded = 0;
    
    @Override
    public boolean add(Integer element) {
        totalElementsAdded++;
        return super.add(element);
    }
    
    @Override
    public boolean addAll(Collection<? extends Integer> collection) {
        totalElementsAdded += collection.size();
        return super.addAll(collection);
    }
    
    public int getTotalElementsAdded() {
        return totalElementsAdded;
    }
} 