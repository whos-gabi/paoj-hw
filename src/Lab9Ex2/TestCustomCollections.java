package Lab9Ex2;

import java.util.*;

public class TestCustomCollections {
    public static void main(String[] args) {
        System.out.println("=== Test CustomHashSet ===");
        testCustomHashSet();
        
        System.out.println("\n=== Test CustomLinkedList ===");
        testCustomLinkedList();
        
        System.out.println("\nObservatii:");
        System.out.println("HashSet: Nu permite duplicate, deci totalElementsAdded poate fi diferit de size()");
        System.out.println("LinkedList: Permite duplicate, deci totalElementsAdded va fi egal cu size()");
    }
    
    private static void testCustomHashSet() {
        CustomHashSet customHashSet = new CustomHashSet();
        
        System.out.println("Adaugam elementele: 1, 2, 3, 2, 4");
        customHashSet.add(1);
        customHashSet.add(2);
        customHashSet.add(3);
        customHashSet.add(2); // duplicat
        customHashSet.add(4);
        
        System.out.println("lenght: " + customHashSet.size());
        System.out.println("Total elemente adaugate: " + customHashSet.getTotalElementsAdded());
        System.out.println("Continutul: " + customHashSet);
        
        System.out.println("\nAdaugam colecția [5, 6, 7, 6] cu addAll:");
        List<Integer> lista = Arrays.asList(5, 6, 7, 6);
        customHashSet.addAll(lista);
        
        System.out.println("lenght: " + customHashSet.size());
        System.out.println("Total elemente adaugate: " + customHashSet.getTotalElementsAdded());
        System.out.println("Continutul: " + customHashSet);
    }
    
    private static void testCustomLinkedList() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        
        System.out.println("Adaugam elementele: 1, 2, 3, 2, 4");
        customLinkedList.add(1);
        customLinkedList.add(2);
        customLinkedList.add(3);
        customLinkedList.add(2); // duplicat - va fi adaugat in LinkedList
        customLinkedList.add(4);
        
        System.out.println("lenght: " + customLinkedList.size());
        System.out.println("Total elemente adaugate: " + customLinkedList.getTotalElementsAdded());
        System.out.println("Continutul: " + customLinkedList);
        
        System.out.println("\nAdaugam colectia [5, 6, 7, 6] cu addAll:");
        List<Integer> lista = Arrays.asList(5, 6, 7, 6);
        customLinkedList.addAll(lista);
        
        System.out.println("lenght: " + customLinkedList.size());
        System.out.println("Total elemente adaugate: " + customLinkedList.getTotalElementsAdded());
        System.out.println("Continutul: " + customLinkedList);
    }
} 