import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> books = new LinkedList<>();
        System.out.println(books.isEmpty());
        books.offer("Rich Dad Poor Dad");
        books.offer("Atomic Habits");
        books.offer("Zero to One");
        books.offer("Verity");

        System.out.println(books);
        System.out.println(books.isEmpty());// returns true if queue is empty
        String remove = books.poll();//  It removes the first element(head) from the queue
        String look = books.peek();// returns current first element(head)

        System.out.println(books);
        System.out.println(remove);
        System.out.println(look);
        System.out.println(books.contains("Verity"));
        System.out.println(books.size());
    }
}
