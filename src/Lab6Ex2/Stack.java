package Lab6Ex2;

import Lab6Ex1.Task;
/*
    Stack - LIFO
 */
public class Stack extends AbsContainer {
    public Stack() {
        super();
    }
    public Stack(int capacity) {
        super(capacity);
    }
    public Stack(Task[] tasks) {
        super(tasks);
    }

    @Override
    public Task remove() {
        if (isEmpty()) {
            System.out.println("Containerul este gol!");
            return null;
        }
        return tasks[--size];
    }
}