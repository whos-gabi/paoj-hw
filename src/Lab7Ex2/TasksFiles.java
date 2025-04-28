package Lab7Ex2;
/*
* 2. Scrieti un program Java care:
    a. sa gaseasca cel mai lung cuvant dintr-un fisier text;
    b. sa adauge continutul clasei curente Java in fisierul text utilizat la exercitiul anterior;
    c. sa salveze intr-un array, linie cu linie, continutul fisierului folosit la primul exercitiu.
* */

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class TasksFiles {

    public static String findLongestWord(String filePath) throws IOException {
        String resultWord = "";
        for (String line : Files.readAllLines(Paths.get(filePath))) {
            //pentru fiecare cuvant
            for (String word : line.split("[^A-Za-z0-9]+")) {
                if (!word.isEmpty() && word.length() > resultWord.length()) {
                    resultWord = word;
                }
            }
        }
        return resultWord;
    }


    public static void appendClassSource(String filePath) throws IOException {
        // Get source file path
        String className = TasksFiles.class.getSimpleName() + ".java";
        String packagePath = TasksFiles.class.getPackage().getName().replace('.', '/');
        Path sourcePath = Paths.get("src", packagePath, className);

        if (Files.exists(sourcePath)) {
            //continutul fisierului
            String sourceContent = Files.readString(sourcePath);

            try (FileWriter writer = new FileWriter(filePath, true)) {
                // adauga continutul in fisierul text (la final)
                writer.write(sourceContent);
            }
        } else {
            System.err.println("Sursa nu sa gasit: " + sourcePath);
        }
    }

    public static String[] readLinesIntoArray(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath)).toArray(new String[0]);
    }

    public static void main(String[] args) {
        String filePath = "src/Lab7Ex2/testFile.txt";

        try {
            String longestWord = findLongestWord(filePath);
            System.out.println("Cel mai lung cuvant: " + longestWord);

            // b:
            appendClassSource(filePath);
            System.out.println("Fisier modificat!");

            // c:
            String[] lines = readLinesIntoArray(filePath);
            System.out.println("Nr de linii: " + lines.length);


        } catch (IOException e) {
            System.err.println("Eroare la procesarea fisierului: " + e.getMessage());
        }
    }
}