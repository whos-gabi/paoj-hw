package Lab6Ex1;

import java.util.Random;

public class RandomOutTask implements Task {
    private int randomNumber;

    public RandomOutTask() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100); // Generates a random number between 0 and 99
    }

    @Override
    public void execute() {
        System.out.println("Numar random out task: "+randomNumber);
    }
}