// Queue.java
// demonstrates queue
// to run this program: C>java QueueApp
////////////////////////////////////////////////////////////////
class Queue1
   {
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;
//--------------------------------------------------------------
   public Queue1(int s)          // constructor
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

    System.out.println("\n");
    // Handle wraparound for the rear index
    int rearIndex = (rear == -1) ? maxSize - 1 : rear;
    System.out.println();
    System.out.println("\nFront index: " + front + "; queArray[front index] = "+queArray[front]);
    System.out.println("\nRear index: " + rearIndex + "; queArray[rear index] = "+queArray[rearIndex]);
}


   }  // end class Queue
////////////////////////////////////////////////////////////////
class QueueAppQ1
   {
   public static void main(String[] args)
      {
      Queue1 theQueue = new Queue1(5);  // queue holds 5 items

      theQueue.insert(10);            // insert 4 items
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);

      theQueue.remove();              // remove 3 items
      theQueue.remove();              //    (10, 20, 30)
      theQueue.remove();

      theQueue.insert(50);            // insert 4 more items
      theQueue.insert(60);            //    (wraps around)
      theQueue.insert(70);
      theQueue.insert(80);

    //   while( !theQueue.isEmpty() )    // remove and display
    //      {                            //    all items
    //      long n = theQueue.remove();  // (40, 50, 60, 70, 80)
    //      System.out.print(n);
    //      System.out.print(" ");
    //      }
      theQueue.displayQueue(); 
      System.out.println("");
      }  // end main()
   }  // end class QueueApp
////////////////////////////////////////////////////////////////
/*  Explain how wraparound works: 
 * The rear index increases as elements are added to the queue. 
 * When the rear index reaches the end of the array, 
 * if there are still empty spaces at the beginning of the array, 
 * the rear index is reset to 0
 */