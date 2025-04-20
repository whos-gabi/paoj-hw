package Lab6Ex2;

import Lab6Ex1.Task;

public abstract class AbsContainer implements Container{
    protected Task[] tasks;
    protected int size;

    public AbsContainer() {
        tasks = new Task[100];
        size = 0;
    }
    public AbsContainer(int capacity) {
        tasks = new Task[capacity];
        size = 0;
    }
    public AbsContainer(Task[] tasks) {
        this.tasks = tasks;
        size = tasks.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Task task) {
        if (size < tasks.length) {
            tasks[size++] = task;
        } else {
            System.out.println("Containerul este full!");
        }
    }

}
