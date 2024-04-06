// Queue.java
// demonstrates queue
// to run this program: C>java QueueApp
////////////////////////////////////////////////////////////////
class Queue5
   {
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;
//--------------------------------------------------------------
   public Queue5(int s)          // constructor
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
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert element.");
            return;
        }  
      if(rear == maxSize-1)         // deal with wraparound
         rear = -1;
      queArray[++rear] = j;         // increment rear and insert
      nItems++;                     // one more item
      }
//--------------------------------------------------------------
   public long remove()         // take item from front of queue
      { 
        if (isEmpty()) {
        System.out.println("Queue is empty. Cannot remove element.");
        return -1; // Or throw an exception
        }
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
   }  // end class Queue
////////////////////////////////////////////////////////////////
class QueueAppQ5
   {
   public static void main(String[] args)
      {
      Queue5 theQueue = new Queue5(5);  // queue holds 5 items

      theQueue.insert(10);            // insert 6 items
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);
      theQueue.insert(50);  
      theQueue.insert(60); 
      

      theQueue.remove();              // remove 6 items
      theQueue.remove();             
      theQueue.remove();
      theQueue.remove();              
      theQueue.remove();            
      theQueue.remove();
               
                
      

      while( !theQueue.isEmpty() )    // remove and display
         {                            //    all items
         long n = theQueue.remove();  
         System.out.print(n);
         System.out.print(" ");
         }

      }  // end main()
   }  // end class QueueApp
////////////////////////////////////////////////////////////////