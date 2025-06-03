package Lab9Ex1;

public class Student {
    private String nume;
    private float medie;
    
    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }
    
    public String getNume() {
        return nume;
    }
    
    public float getMedie() {
        return medie;
    }
    
    @Override
    public String toString() {
        return nume + " (medie: " + medie + ")";
    }
} 