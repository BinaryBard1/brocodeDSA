import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {

        Queue <Double> marks1 = new PriorityQueue<>();
        marks1.offer(18.3);
        marks1.offer(18.1);
        marks1.offer(18.8);
        marks1.offer(19.3);

        while(!marks1.isEmpty()){
            System.out.print(marks1.poll()+" ");
        }
        System.out.println();

        Queue<Double> marks = new PriorityQueue<>(Collections.reverseOrder());
        marks.offer(18.3);
        marks.offer(18.1);
        marks.offer(18.8);
        marks.offer(19.3);

        while(!marks.isEmpty()){
            System.out.print(marks.poll()+" ");
        }
        System.out.println();

        Queue<String> name = new PriorityQueue<>();
        name.offer("B");
        name.offer("C");
        name.offer("A");
        while(!name.isEmpty()){
            System.out.print(name.poll());
        }

        System.out.println();

        Queue<String> name1 = new PriorityQueue<>(Collections.reverseOrder());
        name1.offer("B");
        name1.offer("C");
        name1.offer("A");
        while(!name1.isEmpty()){
            System.out.print(name1.poll());
        }
    }
}
