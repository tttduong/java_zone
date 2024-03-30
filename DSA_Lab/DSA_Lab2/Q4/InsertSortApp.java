package Q4; 

// insertSort.java
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class InsertSortApp
   {
   private int[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public InsertSortApp(int max)          // constructor
      {
      a = new int[max];                 // create the array
      nElems = 0;                        // no items yet
      }
//--------------------------------------------------------------
   public void insert(int value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
//--------------------------------------------------------------
   public void insertionSort()
      {
        int comparison = 0;
        int count_copies = 0;
        int count_swap = 0;
        int i, j, temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            count_copies++;
            j = i - 1;
            comparison++;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                count_copies++;
                j--;
                comparison++;
            }
            a[j + 1] = temp;
            count_copies++;
            count_swap++;
        }
        System.out.println("Number of Comparisons: " +comparison);
        System.out.println("Number of Swaps: " +count_swap);
        System.out.println("Number of Copies: " +count_copies);
      }  // end insertionSort()
//--------------------------------------------------------------
   }  // end class ArrayIns
////////////////////////////////////////////////////////////////
// class InsertSortApp
//    {
//    public static void main(String[] args)
//       {
//       int maxSize = 100;            // array size
//       ArrayIns arr;                 // reference to array
//       arr = new ArrayIns(maxSize);  // create the array

//       arr.insert(77);               // insert 10 items
//       arr.insert(99);
//       arr.insert(44);
//       arr.insert(55);
//       arr.insert(22);
//       arr.insert(88);
//       arr.insert(11);
//       arr.insert(00);
//       arr.insert(66);
//       arr.insert(33);

//       arr.display();                // display items

//       arr.insertionSort();          // insertion-sort them

//       arr.display();                // display them again
//       }  // end main()
//    }  // end class InsertSortApp