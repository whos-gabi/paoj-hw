package Lab4Ex2;

public class Triangle extends Form {
    private float base;
    private float height;

    public Triangle() {
        this(1.0f, 1.0f, "red");
    }

    public Triangle(float base, float height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triunghi: " + super.toString() + " " + getArea();
    }

    //e. Adăugați o metodă equals() în clasa Triangle. Justificați criteriul de echivalentă ales.
    public boolean equals(Triangle t) {
        // comparam aria triunghiurilor si culoarea lor, pentru ca area este unica indiferent de orientarea triunghiului
      return this.getArea() == t.getArea() && super.toString().equals(t.toString());
    }

    public void printTriangleDimensions() {
        System.out.println("Base: " + base + ", Height: " + height);
    }

}