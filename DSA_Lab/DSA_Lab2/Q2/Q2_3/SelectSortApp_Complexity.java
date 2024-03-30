package Q2.Q2_3;



// selectSort.java
// demonstrates selection sort
// to run this program: C>java SelectSortApp
////////////////////////////////////////////////////////////////
class ArraySel {
   private long[] a; // ref to array a
   private int nElems; // number of data items
   // --------------------------------------------------------------

   public ArraySel(int max) // constructor
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
   public void selectionSort() {
      int out, in, min;
      int number_of_comparisons =0; 
      int total_comparisons=0; 
      for (out = 0; out < nElems - 1; out++) // outer loop
      {
         System.out.println("--------------------------------------");

         System.out.println("Outer loop " + out + " :");

         min = out; // minimum
         
         for (in = out + 1; in < nElems; in++) {// inner loop

            number_of_comparisons ++;
            if (a[in] < a[min]) { // if min greater,
               
               min = in; // we have a new min
            }

            System.out.println("The number of comparisons after the inner loop " +in+": 1" );
            
           
         }
         swap(out, min); // swap them
         
         System.out.println("The number of comparisons after the outer loop is: " + number_of_comparisons);

         System.out.println("The array after inner loop " + in + " :"); // display the array inside after inner loop
         display();

         total_comparisons = total_comparisons + number_of_comparisons; 

         System.out.println("The total number of comparisons is "+total_comparisons);
         number_of_comparisons =0; 
      } // end for(out)
      System.out.println("--------------------------------------");  
      System.out.println("The total number of comparisons is "+total_comparisons);

      double conplexity = total_comparisons*1.0 * (total_comparisons*1.0-1) / (2*1.0); 
      System.out.println("The algorithm's complexity is "+conplexity);
      
   } // end selectionSort()
     // --------------------------------------------------------------

   private void swap(int one, int two) {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
   // --------------------------------------------------------------
} // end class ArraySel
  ////////////////////////////////////////////////////////////////

class SelectSortApp_Complexity {
   public static void main(String[] args) {
      int maxSize = 100; // array size
      ArraySel arr; // reference to array
      arr = new ArraySel(maxSize); // create the array

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

      arr.selectionSort(); // selection-sort them

      arr.display(); // display them again
   } // end main()
} // end class SelectSortApp
  ////////////////////////////////////////////////////////////////

