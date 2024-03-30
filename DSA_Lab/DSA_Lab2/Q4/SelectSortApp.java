package Q4;

// selectSort.java
// demonstrates selection sort
// to run this program: C>java SelectSortApp
////////////////////////////////////////////////////////////////
class SelectSortApp
   {
   private int[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public SelectSortApp(int max)          // constructor
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
   public void selectionSort()
      {
        int comparison = 0;
        int count_copies = 0;
        int count_swap = 0;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            count_copies++;
            for (int j = i + 1; j < a.length; j++) {
                comparison++;
                if (a[min] > a[j]) {
                    min = j;
                    count_copies++;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            count_swap ++;
        }
        System.out.println("Count Comparison: " +comparison);
        System.out.println("Count Swap: " +count_swap);
        System.out.println("Count Copies: " +count_copies);
      }  // end selectionSort()
//--------------------------------------------------------------
   private void swap(int one, int two)
      {
      int temp = a[one];
      a[one] = a[two];
      a[two] = temp;
      }
//--------------------------------------------------------------
   }  // end class ArraySel
////////////////////////////////////////////////////////////////
// class SelectSortApp
//    {
//    public static void main(String[] args)
//       {
//       int maxSize = 100;            // array size
//       ArraySel arr;                 // reference to array
//       arr = new ArraySel(maxSize);  // create the array

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

//       arr.selectionSort();          // selection-sort them

//       arr.display();                // display them again
//       }  // end main()
//    }  // end class SelectSortApp
// ////////////////////////////////////////////////////////////////