package Lab7Ex1;

import Lab7Ex1.Exceptii.*;

import java.io.*;
import java.util.*;

public class FileCalculator implements Calculator {

    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul sau ambii parametri sunt null.");
        }
        double result = a + b;

        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("Suma a rezultat overflow.");
        }
        if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Suma a rezultat in underflow.");
        }
        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, MyArithmeticException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul sau ambii parametri sunt null.");
        }
        if (b == 0) {
            throw new MyArithmeticException("Impartirea la zero nu este permisa.");
        }
        return a / b;
    }

    @Override
    public double average(double[] numbers) throws NullParameterException, MyArithmeticException {
        if (numbers == null) {
            throw new NullParameterException("Vector-ul este null.");
        }
        if (numbers.length == 0) {
            throw new MyArithmeticException("Nu se poate calcula media unui vector gol.");
        }

        double sum = 0;
        for (double num : numbers) {
            try {
                sum = add(sum, num);
            } catch (OverflowException | UnderflowException e) {
                throw new MyArithmeticException("Eroare la calculul sumei: " + e.getMessage());
            }
        }
        return divide(sum, (double) numbers.length);
    }

    public double[] citesteValoriDinFisier(String numeFisier) throws IOException {
        List<Double> valori = new ArrayList<>();

        try (BufferedReader cititor = new BufferedReader(new FileReader(numeFisier))) {
            String linie;
            int numarLinie = 0;

            while ((linie = cititor.readLine()) != null) {
                numarLinie++;
                linie = linie.trim();

                if (!linie.isEmpty()) {
                    try {
                        double valoare = Double.parseDouble(linie);
                        valori.add(valoare);
                    } catch (NumberFormatException e) {
                        throw new IOException("Format invalid de numar la linia " + numarLinie + ": '" + linie + "'");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new IOException("Nu s-a putut gasi fisierul: " + numeFisier);
        }

        if (valori.isEmpty()) {
            throw new IOException("Fisierul nu contine numere valide sau este gol");
        }

        double[] rezultat = new double[valori.size()];
        for (int i = 0; i < valori.size(); i++) {
            rezultat[i] = valori.get(i);
        }

        return rezultat;
    }
}