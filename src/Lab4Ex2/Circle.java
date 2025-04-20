package Lab4Ex2;

public class Circle extends Form {
    private float radius;

    public Circle() {
        this(1.0f, "blue");
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Cerc: " + super.toString() + " " + getArea();
    }

    public void printCircleDimensions() {
        System.out.println("Radius: " + radius);
    }
}