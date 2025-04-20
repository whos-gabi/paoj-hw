package Lab6Ex2;

import Lab6Ex1.Task;
/*
    Queue - FIFO
 */
public class Queue extends AbsContainer {
    public Queue() {
        super();
    }
    public Queue(int capacity) {
        super(capacity);
    }
    public Queue(Task[] tasks) {
        super(tasks);
    }

    @Override
    public Task remove() {
        if (isEmpty()) {
            System.out.println("Containerul este gol!");
            return null;
        }
        Task task = tasks[0];
        //Eliminam primul element din array
        //si mutam restul elementelor cu o pozitie in fata
        System.arraycopy(tasks, 1, tasks, 0, --size);
        return task;
    }
}