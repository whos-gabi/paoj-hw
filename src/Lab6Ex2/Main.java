package Lab6Ex2;

import Lab6Ex1.*;


public class Main {

    public static void main(String[] args) {
        Task t1 = new OutTask("Task 1");
        Task t2 = new RandomOutTask();
        Task t3 = new OutTask("Task 3");
        Task t4 = new CounterOutTask();
        Task t5 = new RandomOutTask();

        Container stack = new Stack(new Task[]{t1, t2, t3, t4, t5});

        System.out.println("Stack:");
        while (!stack.isEmpty()) {
            stack.remove().execute();
        }

        Container queue = new Queue(new Task[]{t1, t2, t3, t4, t5});

        System.out.println("Queue:");
        while (!queue.isEmpty()) {
            queue.remove().execute();
        }

    }
}
