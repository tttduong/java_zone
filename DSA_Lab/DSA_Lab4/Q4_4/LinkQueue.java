class LinkQueue
   {
   private FirstLastList theList;
   private int countToRemove=0; 
 
//--------------------------------------------------------------
   public LinkQueue()                // constructor
      { theList = new FirstLastList(); }  // make a 2-ended list
//--------------------------------------------------------------
   public boolean isEmpty()          // true if queue is empty
      { return theList.isEmpty(); }
//--------------------------------------------------------------
   public void insert(long j)        // insert, rear of queue
      { theList.insertLast(j); }
//--------------------------------------------------------------
   public long remove()              // remove, front of queue
      {  return theList.deleteFirst();  }
//--------------------------------------------------------------
   public void displayQueue()
      {
      System.out.print("Queue (front-->rear): ");
      theList.displayList();
      }
//--------------------------------------------------------------



public void addLink() {
   for (int i = 1; i <= numOfLink(); i++) {
       theList.insert(i);
   }
}

public int numOfLink(){
   System.out.println("theList.numOfList() = "+theList.numOfLink());
   return theList.numOfLink(); 
} 

  
public long remove_after_n_calls (int n){
      
      if(countToRemove == 0){
         countToRemove=n;
         countToRemove--;
         return 0; 
      }
       if(countToRemove != 0 ){
         countToRemove --; 
         if(countToRemove ==0){
            theList.deleteNth(n);
         }
         
      } 
      return 0; 

   }
   }  // end class LinkQueue