import java.util.*;

public class Main{
    public static void main(String []args){
        Queue<String> queue=new LinkedList<>();
        queue.add("fanny");
        queue.add("ange");
        queue.add("eric");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue.peek());

        Stack<String > books=new Stack<>();
        books.push("java");
        books.push("maths");
        books.push("english");

        System.out.println(books);
        books.pop();
        System.out.println(books.empty());

        Iterator<String> it= books.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}