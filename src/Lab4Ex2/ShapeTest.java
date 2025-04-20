package Lab4Ex2;

public class ShapeTest {

    public static void main(String[] args) {
        //d. Adăugați metode toString() în cele două clase derivate care să returneze tipul obiectului, culoarea si aria. De exemplu:
        //- pentru clasa Triangle, se va afișa: “Triunghi: rosu 10”
        //- pentru clasa Circle, se va afișa: “Cerc: verde 12.56”
        //Modificați implementarea toString() din clasele derivate astfel încât aceasta să utilizeze implementarea metodei toString() din clasa de bază.
        Form circle1 = new Circle(5.0f, "blue");
        Form triangle1 = new Triangle(3.0f, 4.0f, "red");

        System.out.println("Aria Cerc: " + circle1.getArea());
        System.out.println("Aria Triunghi: " + triangle1.getArea());

        System.out.println(circle1);
        System.out.println(triangle1);

        //f. Creați un vector de obiecte Form și populați-l cu obiecte de tip Triangle și Circle (upcasting).
        //Parcurgeți acest vector și apelați metoda toString() pentru elementele sale. Ce observați?

        Form[] shapes = new Form[5];
        shapes[0] = new Circle(2.6f, "green");
        shapes[1] = new Circle(3.7f, "yellow");
        shapes[2] = new Triangle(2.0f, 3.0f, "purple");
        shapes[3] = new Triangle(40.1f, 2.2f, "orange");
        shapes[4] = new Circle(3.9f, "pink");
        for (Form shape : shapes) {
            System.out.println(shape.toString());
        }
        //Observam ca toString() este apelata din clasa extinsa


        //g. Adăugați clasei Triangle metoda printTriangleDimensions() și clasei Circle metoda printCircleDimensions(). Implementarea metodelor constă în afișarea bazei si inaltimii, respectiv razei.
        //Parcurgeți vectorul de la exercițiul anterior și, folosind downcasting la clasa corespunzătoare, apelați metodele specifice fiecărei clase (printTriangleDimensions pentru Triangle și printCircleDimensions pentru Circle).
        //Pentru a stabili tipul obiectului curent folosiți operatorul instanceof.
        System.out.println("Downcasting:");
        for (Form shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.printCircleDimensions();
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                triangle.printTriangleDimensions();
            }
        }


        //h. Adaugati o implementare la programul anterior astfel încât să nu mai folositi operatorul "instanceof".
        System.out.println("Downcasting fara instanceof:");
        for (Form shape : shapes) {
            if (shape.getClass() == Circle.class) {
                Circle circle = (Circle) shape;
                circle.printCircleDimensions();
            } else if (shape.getClass() == Triangle.class) {
                Triangle triangle = (Triangle) shape;
                triangle.printTriangleDimensions();
            }
        }

    }
}
