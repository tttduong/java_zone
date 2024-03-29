package Q1.Q1_3;

// bubbleSort.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
class ArrayBub {
    private long[] a; // ref to array a
    private int nElems; // number of data items
    // --------------------------------------------------------------

    public ArrayBub(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    // --------------------------------------------------------------
    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    // --------------------------------------------------------------
    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    }

    // --------------------------------------------------------------
    public void bubbleSort() {
        int out, in;
        int number_of_comparisons = 0, total_comparisons = 0;
        
        for (out = nElems - 1; out > 1; out--) { // outer loop (backward)
            System.out.println("--------------------------------------");
            int out_num = nElems - out;
            System.out.println("Outer loop " + out_num + " :");
            for (in = 0; in < out; in++) { // inner loop (forward)
                if (a[in] > a[in + 1]) { // out of order?
                    swap(in, in + 1); // swap them
                }
                number_of_comparisons += 1;
                System.out.println("The number of comparisons in the inner loop " + in + ": " + number_of_comparisons);
                total_comparisons += number_of_comparisons;
                number_of_comparisons = 0;
            }
        }
        System.out.println("The total number of comparison: "+total_comparisons); 
        double complexity = total_comparisons*1.0*(total_comparisons*1.0-1)/2.0; 
        System.out.println("the algorithms' complexity: "+complexity); 
    } // end bubbleSort()
      // --------------------------------------------------------------

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    // --------------------------------------------------------------
} // end class ArrayBub
  ////////////////////////////////////////////////////////////////

class BubbleSortApp_Complexity {
    public static void main(String[] args) {
        int maxSize = 100; // array size
        ArrayBub arr; // reference to array
        arr = new ArrayBub(maxSize); // create the array

        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display(); // display items

        arr.bubbleSort(); // bubble sort them

        arr.display(); // display them again
    } // end main()
} // end class BubbleSortApp
  ////////////////////////////////////////////////////////////////