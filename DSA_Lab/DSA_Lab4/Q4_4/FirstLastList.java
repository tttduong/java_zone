class FirstLastList {
   private Link first=null; // ref to first item
   private Link last=null; // ref to last item
   private Link current=null;
   private int count; // total items in the list
   
   // -------------------------------------------------------------

   public FirstLastList() // constructor
   {
      first = null; // no items on list yet
      last = null;
   }

   // -------------------------------------------------------------
   public boolean isEmpty() // true if no links
   {
      return first == null;
   }

   // -------------------------------------------------------------
   public void insertLast(long dd) // insert at end of list
   {
      Link newLink = new Link(dd); // make new link
      if (isEmpty()) // if empty list,
         first = newLink; // first --> newLink
      else
         last.next = newLink; // old last --> newLink
      last = newLink; // newLink <-- last
   }

   // -------------------------------------------------------------
   public long deleteFirst() // delete first link
   { // (assumes non-empty list)
      long temp = first.dData;
      if (first.next == null) // if only one item
         last = null; // null <-- last
      first = first.next; // first --> old next
      return temp;
   }

   // -------------------------------------------------------------

   public Link getLast(){
      return last; 
   }
  

   public void displayList() {
      int x=0; 
      current = first; // start at beginning
      while (current != null) // until end of list,
      {
         current.displayLink(); // print data
         current = current.next; // move to next link
      }
      System.out.println(" ");
   }


   public int numOfLink(){
      int numOfLink=0;
      current = first; // start at beginning
      while (current != null) // until end of list,
      {
         numOfLink++;
         current = current.next; // move to next link
      }
      // System.out.println("theList.numOfLink() = "+numOfLink);
      return numOfLink;
   } 
   
   // public void displayList() {
   // int x = 0;
   // Node printer = first;

   // while (x < count) {
   // printer.displayNode();
   // printer = printer.next;
   // x++;
   // }
   // System.out.println("");

   // }
   // -------------------------------------------------------------
   public void step() {
      current = current.next;
   }
   public void insert(int x) {
      Link newLink = new Link(x);

      if (isEmpty()) {
         first = newLink;
         current = first;
      } else {
         current.next = newLink;
      }

      newLink.next = first;
      last = newLink;
      step();
      count++;
   }

   public void deleteNth(int n) // delete nth
   {
      for (int i = 1; i < n; i++) { // move to nth
         last = first;
         first = first.next;
      }
      System.out.println(first.dData);
      System.out.println(first.next.dData);
      System.out.println(last.dData);
      // deleteFirst
      if (first.next == null) { // if only one item
         last = null;
      } // null <-- last
      first = first.next; // first --> old next
      System.out.println(first.dData);
      System.out.println(first.next.dData);
      System.out.println(last.dData);
   }
} // end class FirstLastList