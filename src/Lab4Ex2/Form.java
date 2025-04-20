package Lab4Ex2;

public class Form {
    private String color;

    //constructor
    public Form(String color) {
        this.color = color;
    }
    public Form(){
        this.color = "red";
    }

    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return color;
    }

}
