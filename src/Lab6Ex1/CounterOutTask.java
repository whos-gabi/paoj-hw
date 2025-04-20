package Lab6Ex1;

public class CounterOutTask implements Task {
    private static int counter = 0;

    public CounterOutTask() {
        counter++;
    }

    @Override
    public void execute() {
        System.out.println("Counter Value: " + counter);
    }
}