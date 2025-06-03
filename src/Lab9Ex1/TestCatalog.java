package Lab9Ex1;

import java.util.*;

public class TestCatalog {
    public static void main(String[] args) {
        // Creează un comparator pentru ordonarea descrescătoare a cheilor
        Comparator<Integer> comparatorDescrescator = (a, b) -> b.compareTo(a);
        
        // Instanțiază catalogul
        Catalog catalog = new Catalog(comparatorDescrescator);
        
        // Adaugă câțiva studenți
        catalog.add(new Student("Ana", 8.7f));
        catalog.add(new Student("Bogdan", 7.8f));
        catalog.add(new Student("Cristina", 9.2f));
        catalog.add(new Student("Dan", 8.1f));
        catalog.add(new Student("Elena", 7.6f));
        catalog.add(new Student("Florin", 9.8f));
        catalog.add(new Student("Georgiana", 8.3f));
        
        System.out.println("Catalogul (ordonat descrescător după medie):");
        
        // Iterează pe catalog și sortează alfabetic fiecare listă
        for (Map.Entry<Integer, List<Student>> entry : catalog.entrySet()) {
            int medie = entry.getKey();
            List<Student> studenti = entry.getValue();
            
            // Sortează alfabetic lista de studenți
            studenti.sort(Comparator.comparing(Student::getNume));
            
            System.out.println("\nMedia " + medie + ":");
            for (Student student : studenti) {
                System.out.println("  " + student);
            }
        }
    }
} 