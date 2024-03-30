package Q1.Q1_2;

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
      int count_comparison = 0;
      int total_comparisons = 0;
      double complexity;
      for (out = nElems - 1; out > 1; out--) {// outer loop (backward)
         System.out.println("--------------------------------------");
         int out_num = nElems - out;
         System.out.println("Outer loop " + out_num + " :");

         for (in = 0; in < out; in++) { // inner loop (forward)
            count_comparison += 1;
            if (a[in] > a[in + 1]) { // out of order?
               swap(in, in + 1);
               count_comparison += 1;
            }
            System.out.println("The number of comparisons after inner loop " + in + ": " + count_comparison);
            total_comparisons += count_comparison;
            count_comparison = 0;
         }
      }

      complexity = total_comparisons * 1.0 * (total_comparisons - 1) * 1.0 / 2.0;
      System.out.println("The total number of comparisons is " + total_comparisons);
      System.out.println("The complexity of the algorithm is " + complexity);

   }// end bubbleSort()
   // --------------------------------------------------------------

   private void swap(int one, int two) {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
   // --------------------------------------------------------------
} // end class ArrayBub
////////////////////////////////////////////////////////////////

class BubbleSortApp_DisplayNumberOfSwapsAfterInnerLoop {
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