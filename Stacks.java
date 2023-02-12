import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack <String> books = new Stack<>();
        System.out.println(books.isEmpty());
        books.push("Rich Dad Poor Dad");
        books.push("Atomic Habits");
        books.push("Zero to One");
        books.push("Verity");

        int item = books.search("Verity");
        String last = books.pop();//we can store pop value in any variable to use it for further use

        System.out.println(books);
        System.out.println(books.isEmpty()); // returns true or false
        System.out.println(item);// As Verity is last added item its position will be 1 and last added item that is Richdad will be 4
        System.out.println(books.search("Rich Dad Poor Dad"));
        System.out.println(books.search("The Art ___"));/// If element is not present then returns -1
        System.out.println(last);/// If element is not present then returns -1
        System.out.println(books.peek());

    }
}
