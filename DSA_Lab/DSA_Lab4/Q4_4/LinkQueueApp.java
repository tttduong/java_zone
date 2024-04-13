class LinkQueueApp
   {
      
   public static void main(String[] args)
      {
      LinkQueue theQueue = new LinkQueue();
      theQueue.insert(20);                 // insert items
      theQueue.insert(40);
      theQueue.addLink();
      theQueue.displayQueue();             // display queue

      theQueue.insert(60);                 // insert items
      theQueue.insert(80);
      

      theQueue.displayQueue();             // display queue

      System.out.println("Num_of_link:"+theQueue.numOfLink());
      
      // theQueue.remove();                   // remove items
      // theQueue.remove();

      theQueue.displayQueue();             // display queue
System.out.println("------------------------------------"); 
      theQueue.remove_after_n_calls(2);
      theQueue.displayQueue(); 
      
      theQueue.remove_after_n_calls(2);
      theQueue.displayQueue(); 
 
      }  // end main()
   }  // end class LinkQueueApp