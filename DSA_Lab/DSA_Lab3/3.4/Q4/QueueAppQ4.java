// Queue.java
// demonstrates queue
// to run this program: C>java QueueApp
////////////////////////////////////////////////////////////////
class Queue4
   {
   private int maxSize;
   private long[] queArray;
   private long array[]; 
   private int front;
   private int rear;
   private int nItems;
   
//--------------------------------------------------------------
   public Queue4(int s)          // constructor
      {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
      }
//--------------------------------------------------------------
   public void insert(long j)   // put item at rear of queue
      {
      if(rear == maxSize-1)         // deal with wraparound
         rear = -1;
      queArray[++rear] = j;         // increment rear and insert
      nItems++;                     // one more item
      }
//--------------------------------------------------------------
   public long remove()         // take item from front of queue
      {
      long temp = queArray[front++]; // get value and incr front
      if(front == maxSize)           // deal with wraparound
         front = 0;
      nItems--;                      // one less item
      return temp;
      }
//--------------------------------------------------------------
   public long peekFront()      // peek at front of queue
      {
      return queArray[front];
      }
//--------------------------------------------------------------
   public boolean isEmpty()    // true if queue is empty
      {
      return (nItems==0);
      }
//--------------------------------------------------------------
   public boolean isFull()     // true if queue is full
      {
      return (nItems==maxSize);
      }
//--------------------------------------------------------------
   public int size()           // number of items in queue
      {
      return nItems;
      }
//--------------------------------------------------------------
public void displayQueue() {
    System.out.print("Queue: \n");
    for (int i = 0; i < queArray.length; i++) {
        System.out.print(queArray[i] + " ");
    }
    // Handle wraparound for the rear index
    int rearIndex = (rear == -1) ? maxSize - 1 : rear;
    System.out.println();
    System.out.println("\nFront index: " + front + "; queArray[front index] = "+queArray[front]);
    System.out.println("\nRear index: " + rearIndex + "; queArray[rear index] = "+queArray[rearIndex]);

}

public void displayFrontRear(){
   // Handle wraparound for the rear index
   int rearIndex = (rear == -1) ? maxSize - 1 : rear;
   System.out.println("\nFront index: " + front + "; queArray[front index] = "+queArray[front]);
   System.out.println("\nRear index: " + rearIndex + "; queArray[rear index] = "+queArray[rearIndex]);
}



   }  // end class Queue
////////////////////////////////////////////////////////////////
class QueueAppQ4
   {
   public static void main(String[] args)
      {
      Queue4 theQueue = new Queue4(5);  // queue holds 5 items
      
      // ----------------------------------------empty queue
      //Display queue, its front and rear
      System.out.print("Display initial queue, its front and rear");
      System.out.print("\nQueue: ");
      while( !theQueue.isEmpty() )    // remove and display
      {                            //    all items
      long n = theQueue.remove();  // (40, 50, 60, 70, 80)
      System.out.print(n);
      System.out.print(" ");
      }
      System.out.print("\n");
      theQueue.displayFrontRear();
      System.out.print("------------------------------------------------------");
      
      // -------------------------------------------------queue with fewer items
      System.out.print("\nDisplay queue with fewer items, its front and rear");
      System.out.print("\nQueue: ");
      theQueue.insert(10);            // insert 4 items
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);


      //Display queue, its front and rear
      while( !theQueue.isEmpty() )    // remove and display
      {                            //    all items
      long n = theQueue.remove();  // (40, 50, 60, 70, 80)
      System.out.print(n);
      System.out.print(" ");
      }
      System.out.print("\n");
      theQueue.displayFrontRear();
      System.out.print("------------------------------------------------------");

      // -------------------------------------------------queue with full items
      System.out.print("\nDisplay queue with full items, its front and rear");
      System.out.print("\nQueue: ");
      theQueue.insert(10);            // insert 5 items        
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);
      theQueue.insert(50);

      //Display queue, its front and rear
      while( !theQueue.isEmpty() )    // remove and display
      {                            //    all items
      long n = theQueue.remove();  // (40, 50, 60, 70, 80)
      System.out.print(n);
      System.out.print(" ");
      }
      System.out.print("\n");
      theQueue.displayFrontRear();
      System.out.print("------------------------------------------------------");

      //-------------------------------------queue with more items
      System.out.print("\nDisplay queue with more items, its front and rear");
      System.out.print("\nQueue: ");
      theQueue.insert(10);            // insert 6 items        
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);
      theQueue.insert(50);
      theQueue.insert(60); 

       //Display queue, its front and rear
       while( !theQueue.isEmpty() )    // remove and display
       {                            //    all items
       long n = theQueue.remove();  // (40, 50, 60, 70, 80)
       System.out.print(n);
       System.out.print(" ");
       }
       System.out.print("\n");
       theQueue.displayFrontRear();
       System.out.print("------------------------------------------------------");

      //  ----------------------------------
      /*
       * When the queue is empty, the following happens:
         front index = 0, rear index = MaxSize -1.

         When the queue is empty, the following happens:
         front index = 0, rear index = MaxSize -1.
       */
      //---------------------------
      }  // end main()
   }  // end class QueueApp
////////////////////////////////////////////////////////////////
