import java.util.*;


class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ  thePQ = new PriorityQ(5);
        // thePQ.insert(30);
        // thePQ.insert(50);
        // thePQ.insert(10);
        // thePQ.insert(40);
        // thePQ.insert(20);
        thePQ.modifiedInsert(30);
        thePQ.modifiedInsert(50);
        thePQ.modifiedInsert(10);
        thePQ.modifiedInsert(40);
        thePQ.modifiedInsert(20);

        thePQ.displayPQueue();

        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + " "); // 10, 20, 30, 40, 50
        } // end while
        System.out.println("");
        System.out.println("Use priority queue");

        Queue<Integer> q = new PriorityQueue<>();
        q.offer(30);
        q.offer(10);
        q.offer(50);
        q.offer(40);
        q.offer(20);
        while (!q.isEmpty()) {
            System.out.print(q.poll());
            System.out.print(" ");
        }
    } // end main()
    // -------------------------------------------------------------
} // end class PriorityQApp