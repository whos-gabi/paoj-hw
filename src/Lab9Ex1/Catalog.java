package Lab9Ex1;

import java.util.*;

public class Catalog extends TreeMap<Integer, List<Student>> {
    
    public Catalog(Comparator<Integer> comparator) {
        super(comparator);
    }
    
    public void add(Student student) {
        float medie = student.getMedie();
        
        if (medie < 0 || medie > 10) {
            throw new IllegalArgumentException("Media trebuie sa fie intre 0 si 10");
        }
        
        int medieRotunjita = Math.round(medie);
        
        if (!this.containsKey(medieRotunjita)) {
            this.put(medieRotunjita, new ArrayList<>());
        }
        
        this.get(medieRotunjita).add(student);
    }
} 