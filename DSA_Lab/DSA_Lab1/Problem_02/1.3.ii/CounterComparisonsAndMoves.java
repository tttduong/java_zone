import java.util.Random;
import java.util.Scanner;

public class CounterComparisonsAndMoves{

    

    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in); 
        
        int length = 5; 
        int i;
        Random random = new Random();
        int digits[] = new int[length]; 
        

        //Enter origin and bound to random 
        System.out.println("Enter the origin to random: ");
        int origin= sc.nextInt(); 
        
        System.out.println("Enter the bound to random: ");
        int bound=sc.nextInt();


        //print initial array
        for (i = 0; i<length; i++){
            digits[i] = random.nextInt(origin,bound); 
            System.out.println(digits[i]); 
        }
        
        //Count the number of comparisons to find the entered item
        int nElems = digits.length; 
        int j ; 
        int count=0, remove =0;

        System.out.println("Enter the number to find: ");
        int searchKey = sc.nextInt();  //find itenm with key = max


        for(j=0; j<nElems; j++){ // for each element,
            if(digits[j] == searchKey) // found item?
            {
                System.out.println("Found " + searchKey); // no
                System.out.println("The number of comparisons: "+j);
                remove = 1;

            }
            // break; // yes, exit before end
            
            if(j == nElems) // at the end?
            {
                System.out.println("Can't find " + searchKey);// yes
                System.out.println("The number of comparisons: "+j);
                
            }

            // else{
            //     System.out.println("Found " + searchKey); // no
            //     System.out.println("The number of comparisons: "+j);
            // }
        }


        //Count the number of memory moves to delete the entered item

        // searchKey = findMax(arr);; // delete item with key = max

    if (remove ==1)
    {
        for(j=0; j<nElems; j++){ // look for it
        if(digits[j] == searchKey)
            break;
    }
    for(int k=j; k<nElems-1; k++){ // move higher ones down
    digits[k] = digits[k+1];
    count++; 
    }
    nElems--; // decrement size

    System.out.println("New array digits: "); 
    for(j=0; j<nElems; j++) // display items
    System.out.print(digits[j] + " ");
    System.out.println("");
    System.out.println("The number of moves: "+count);

    //Explain the change in the number of comparison:
    }
        
        
}
    
}