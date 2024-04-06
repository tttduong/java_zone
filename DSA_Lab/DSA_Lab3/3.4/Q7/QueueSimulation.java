import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueSimulation {
    private static final int MAX_QUEUE_SIZE = 10;
    private static final int MIN_SERVICE_TIME = 1;
    private static final int MAX_SERVICE_TIME = 5;
    private static final double ARRIVAL_RATE = 0.5; // Customers per time unit

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random();

        int totalTime = 0;
        int totalCustomers = 0;

        for (int time = 0; time < 100; time++) { // Simulate 100 time units
            // Customer arrival
            if (rand.nextDouble() < ARRIVAL_RATE) {
                if (queue.size() < MAX_QUEUE_SIZE) {
                    int serviceTime = rand.nextInt(MAX_SERVICE_TIME - MIN_SERVICE_TIME + 1) + MIN_SERVICE_TIME;
                    queue.offer(serviceTime);
                    totalCustomers++;
                } else {
                    // Queue is full, customer is rejected
                }
            }

            // Customer service
            if (!queue.isEmpty()) {
                int remainingServiceTime = queue.poll() - 1;
                if (remainingServiceTime > 0) {
                    queue.offer(remainingServiceTime);
                }
            }

            totalTime += queue.size(); // Accumulate total queue length
        }

        double averageQueueLength = (double) totalTime / 100; // Average queue length over 100 time units
        double averageWaitTime = (double) totalTime / totalCustomers; // Average wait time per customer

        System.out.println("Average Queue Length: " + averageQueueLength);
        System.out.println("Average Wait Time: " + averageWaitTime);
        
    }
}
