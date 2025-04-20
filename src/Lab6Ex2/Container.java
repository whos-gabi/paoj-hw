package Lab6Ex2;
import Lab6Ex1.Task;

public interface Container {
    boolean isEmpty();
    void add(Task task);
    Task remove();
}