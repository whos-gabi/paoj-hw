package Lab6Ex1;

public class TaskTest {
    public static void main(String[] args) {
        //mesaj
        Task outTask = new OutTask("Hello, World!");
        outTask.execute();
        //random
        Task randomOutTask = new RandomOutTask();
        randomOutTask.execute();
        //counter
        Task counterOutTask1 = new CounterOutTask();
        counterOutTask1.execute();
        Task counterOutTask2 = new CounterOutTask();
        counterOutTask2.execute();
    }
}