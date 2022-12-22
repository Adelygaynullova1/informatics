package New;

public class Main {
    public static void main(String[] args) {
        IQueue queue = new QueueImpl();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.push(5);
        System.out.println(queue.pop());

    }
// 7445948 StackImplList
// 2534548

// 2074956

}
