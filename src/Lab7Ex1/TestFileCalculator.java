package Lab7Ex1;

import Lab7Ex1.Exceptii.*;
import java.io.IOException;

public class TestFileCalculator {
    public static void main(String[] args) {
        FileCalculator calculator = new FileCalculator();

        System.out.println(">>>>>>>>Testare firiere:");

        // Fisier valid
        try {
            System.out.println("Citire din fisier valid 'testInputValid.txt':");
            double[] numereValide = calculator.citesteValoriDinFisier("src/Lab7Ex1/testInputValid.txt");
            System.out.println("   Numere citite: " + numereValide.length);

            for (int i = 0; i < numereValide.length; i++) {
                System.out.println("- Val " + (i + 1) + ": " + numereValide[i]);
            }

            //media
            try {
                System.out.println("\naverage from fiel test:");
                double media = calculator.average(numereValide);
                System.out.println("avg: " + media);
            } catch (Exception e) {
                System.out.println("Eroare la calculul mediei: " + e.getMessage());
            }

            // add
            try {
                System.out.println("\nadd 2 values from file:");
                double suma = calculator.add(numereValide[0], numereValide[1]);
                System.out.println("   " + numereValide[0] + " + " + numereValide[1] + " = " + suma);
            } catch (Exception e) {
                System.out.println("\nEroare la adunare: " + e.getMessage());
            }

            // divide
            try {
                System.out.println("\ndivide test from file:");
                double rezultat = calculator.divide(numereValide[3], numereValide[0]);
                System.out.println("   " + numereValide[3] + " / " + numereValide[0] + " = " + rezultat);
            } catch (Exception e) {
                System.out.println("Eroare la impartire: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("   Eroare: " + e.getMessage());
        }

        // fisier invalid
        try {
            System.out.println("\nFisier invalid 'testInputInvalid.txt':");
            double[] numereInvalide = calculator.citesteValoriDinFisier("src/Lab7Ex1/testInputInvalid.txt");
            System.out.println("Numere citite: " + numereInvalide.length);
        } catch (IOException e) {
            System.out.println("Eroare detectata: " + e.getMessage());
        }

        // fisier inexistent
        try {
            System.out.println("\nFisier inexistent:");
            double[] numere = calculator.citesteValoriDinFisier("src/Lab7Ex1/fisierCareNuExista.txt");
            System.out.println("Numere citite: " + numere.length);
        } catch (IOException e) {
            System.out.println("Eroare detectata: " + e.getMessage());
        }

        System.out.println("\n>>>>>>Methods error handling test:");

        // add
        try {
            System.out.println("\nTest add null param:");
            calculator.add(null, 10.0);
        } catch (NullParameterException e) {
            System.out.println("Eroare detectata corect: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A aparut o alta eroare: " + e.getMessage());
        }

        //  overflow
        try {
            System.out.println("\nTest add overflow:");
            calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (OverflowException e) {
            System.out.println("Eroare detectata corect: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A aparut o alta eroare: " + e.getMessage());
        }

        // underflow
        try {
            System.out.println("\nTest add underflow:");
            calculator.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (UnderflowException e) {
            System.out.println("Eroare detectata corect: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A aparut o alta eroare: " + e.getMessage());
        }

        try {
            System.out.println("\nTest impartire la zero:");
            calculator.divide(5.0, 0.0);
        } catch (MyArithmeticException e) {
            System.out.println("Eroare detectata corect: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A aparut o alta eroare: " + e.getMessage());
        }

        //  average pe array gol
        try {
            System.out.println("\nTest average pe array gol:");
            calculator.average(new double[0]);
        } catch (MyArithmeticException e) {
            System.out.println("Eroare detectata corect: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A aparut o alta eroare: " + e.getMessage());
        }
    }
}