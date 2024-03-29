import java.util.Random;

public class Random_DeleteRandom {
    public static void main (String[] args){
        int length = 100; 
        int i;
        Random random = new Random();
        int digits[] = new int[length]; 

        //print initial array
        for (i = 0; i<length; i++){
            digits[i] = random.nextInt(0,99); 
            System.out.println(digits[i]); 
        }


        //random deleted item 
        int deleteItem = random.nextInt(0,99); 
        System.out.println("Delete item "+deleteItem); 

        // delete item 
        for(i=0; i<length; i++) // look for it
        if(digits[i] == deleteItem)
        break;
        for(int k=i; k<length-1; k++) // move higher ones down
        digits[k] = digits[k+1];
        length--; // decrement size
        
        // print new array
        System.out.println("New array digits: ");
        for (i = 0; i<length; i++){
            System.out.println(digits[i]); 
        }
    }
}
