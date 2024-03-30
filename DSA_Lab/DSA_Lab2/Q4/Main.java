package Q4;

import java.util.Random;

public class Main{
    public static void main (String[] args) {
        int size = 50000;
        // int[] array= new int[size]; 
        
        
        Random rd = new Random();
        BubbleSortApp b = new BubbleSortApp(size);
        SelectSortApp s = new SelectSortApp(size);
        InsertSortApp is = new InsertSortApp(size);
        

        for(int i = 0; i < size; i++) {
            b.insert(rd.nextInt(100));
            s.insert(rd.nextInt(100));
            is.insert(rd.nextInt(100));
        }


        
    
        System.out.println("The outcome of Bubble Sort: ");
        b.bubbleSort();
        System.out.println();
        System.out.println("The outcome of Selection Sort: ");
        s.selectionSort();
        System.out.println();
        System.out.println("The outcome of Insert Sort: ");
        is.insertionSort();
        System.out.println();
    }
}