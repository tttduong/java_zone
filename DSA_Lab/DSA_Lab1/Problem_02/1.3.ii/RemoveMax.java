// array.java
// demonstrates Java arrays
// to run this program: C>java arrayApp
////////////////////////////////////////////////////////////////
class RemoveMax{
    public RemoveMax(){}; 

public static long findMax(long[] arr){

    long searchKey; // key of item to search for
    int nElems = arr.length; // number of items
    int j; // loop counter
    //find max 
    int length = arr.length ; 
    long max = arr[0]; 
    for (int i = 0; i<length; i++){
        if (max < arr[i]){
            max = arr[i]; 
        }
    }
// System.out.println("max = "+max);
// searchKey = 66; // find item with key 66
searchKey = max;  //find itenm with key = max
for(j=0; j<nElems; j++) // for each element,
if(arr[j] == searchKey) // found item?
break; // yes, exit before end
if(j == nElems) // at the end?
{System.out.println("Can't find " + searchKey);// yes
}

else{System.out.println("Found " + searchKey); // no
}

return max; 
}



public static void removeMaxAndDisplay(long[] arr){
    long searchKey; // key of item to search for
    int nElems = arr.length; // number of items
    int j; // loop counter
    searchKey = findMax(arr);; // delete item with key = max
    for(j=0; j<nElems; j++) // look for it
    if(arr[j] == searchKey)
    break;
    for(int k=j; k<nElems-1; k++) // move higher ones down
    arr[k] = arr[k+1];
    nElems--; // decrement size
    for(j=0; j<nElems; j++) // display items
    System.out.print(arr[j] + " ");
    System.out.println("");
}

public static void displayArr(long[] arr){
    int nElems = arr.length; // number of items
    int j; // loop counter
    for(j=0; j<nElems; j++) // display items
    System.out.print(arr[j] + " ");
    System.out.println("");
}

public static void main(String[] args)
{
long[] arr; // reference to array
 arr = new long[10]; // make array
//--------------------------------------------------------------
arr[0] = 77; // insert 10 items
arr[1] = 99;
arr[2] = 44;
arr[3] = 55;
arr[4] = 22;
arr[5] = 88;
arr[6] = 11;
arr[7] = 00;
arr[8] = 66;
arr[9] = 33;

//--------------------------------------------------------------
displayArr(arr); 
//--------------------------------------------------------------
findMax(arr);
//--------------------------------------------------------------
removeMaxAndDisplay(arr); 
//--------------------------------------------------------------

} // end main()
} // end class ArrayApp
