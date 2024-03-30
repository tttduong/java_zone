package Q4;

// bubbleSort.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
class BubbleSortApp
   {
   private int[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public BubbleSortApp(int max)          // constructor
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
   public void bubbleSort()
      {
      int out, in;
      int comparison = 0;
      int count_swap = 0;
      int count_copies = 0;
      
      for(int i = 0; i < a.length - 1; i++) {
        for(int j = 0; j < a.length - i - 1; j++) {
            comparison++;
            if(a[j] > a[j+1]) {
                int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp; 
                count_copies+= 3;
                count_swap++;
            }
        }
    }
        System.out.println("Number of Comparisons: " +comparison);
        System.out.println("Number of Swaps: " +count_swap);
        System.out.println("Number of Copies: " +count_copies);
      }  // end bubbleSort()
//--------------------------------------------------------------
   private void swap(int one, int two)
      {
      int temp = a[one];
      a[one] = a[two];
      a[two] = temp;
      }
//--------------------------------------------------------------
   }  // end class ArrayBub
////////////////////////////////////////////////////////////////
// class BubbleSortApp
//    {
//     public BubbleSortApp(){

//     }
//    public static void main(String[] args)
//       {
//       int maxSize = 100;            // array size
//       ArrayBub arr;                 // reference to array
//       arr = new ArrayBub(maxSize);  // create the array

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

//       arr.bubbleSort();             // bubble sort them

//       arr.display();                // display them again
//       }  // end main()
//    }  // end class BubbleSortApp
////////////////////////////////////////////////////////////////