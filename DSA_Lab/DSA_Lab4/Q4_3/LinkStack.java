 
class LinkStack {
    private LinkList theList;

    // --------------------------------------------------------------
    public LinkStack() // constructor
    {
        theList = new LinkList();
    }

    // --------------------------------------------------------------
    public void push(long j) // put item on top of stack
    {
        theList.insertFirst(j);
    }

    // --------------------------------------------------------------
    public long pop() // take item from top of stack
    {
        return theList.deleteFirst();
    }

    // --------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    {
        return (theList.isEmpty());
    }

    // --------------------------------------------------------------
    public void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }

    public void reverseList() // insert at start of list
    { // make new link
        LinkList newLink = new LinkList();
        // System.out.println(theList.getLong());
        for (int i = theList.getLong(); i != 0; i--) {
            // System.out.println("i="+i+"\n");
            newLink.insertFirst(theList.getFirst());
            theList.deleteFirst();

        }
        System.out.println("--------------------------------\nThe reversed list: ");
        newLink.displayList();

    }
}

// --------------------------------------------------------------
// end class LinkStack