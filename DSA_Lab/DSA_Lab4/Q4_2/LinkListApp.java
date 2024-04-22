// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////
class Link {
    public int iData; // data item
    public double dData; // data item
    public Link next; // next link in list
    // -------------------------------------------------------------

    public Link(int id, double dd) {
        iData = id; // initialize data
        dData = dd; // ('next' is automatically
    } // set to null)
      // -------------------------------------------------------------

    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
} // end class Link
  ////////////////////////////////////////////////////////////////

class LinkList {
    private Link first; // ref to first link on list

    // -------------------------------------------------------------
    public LinkList() {
        first = null; // no links on list yet
    }

    // -------------------------------------------------------------
    public boolean isEmpty() {
        return (first == null);
    }

    // -------------------------------------------------------------
    // insert at start of list
    public void insertFirst(int id, double dd) { // make new link
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    // -------------------------------------------------------------
    public Link deleteFirst() // delete first item
    { // (assumes list not empty)
        Link temp = first; // save reference to link
        first = first.next; // delete it: first-->old next
        return temp; // return deleted link
    }

    // -------------------------------------------------------------
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

    public Link getFirst() {
        return first;
    } 

    public Link getLast() {
        Link current = first;
        if(current != null) {
            while(current.next != null) {
                current = current.next;
            }
        }
        return current;
    }

    public String toString() {
        String string_list = "The list: ";
        Link current = first;
        while (current != null) {
            string_list += "{" +current.iData+ " ," +current.dData+ "} ";
            current = current.next;
        }
        return string_list;
    }
    // -------------------------------------------------------------
} // end class LinkList
  ////////////////////////////////////////////////////////////////

class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList(); // make new list

        theList.insertFirst(22, 2.99); // insert four items
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList(); // display list

        Link first_element = theList.getFirst();
        System.out.println("The first element: {" + first_element.iData + ", " + first_element.dData + "}");
        Link last_element = theList.getLast();
        System.out.println("The last element: {" + last_element.iData + ", " + last_element.dData + "}");
        System.err.println(theList.toString());
    } // end main()
} // end class LinkListApp
  ////////////////////////////////////////////////////////////////