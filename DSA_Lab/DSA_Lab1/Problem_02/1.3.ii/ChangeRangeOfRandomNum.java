import java.util.Random;
import java.util.Scanner;

public class ChangeRangeOfRandomNum {

    
    public static void main (String[] args){
        int length = 5; 
        int i;
        Random random = new Random();
        int digits[] = new int[length]; 
        

        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the origin to random: ");
        int origin= sc.nextInt(); 
        
        System.out.println("Enter the bound to random: ");
        int bound=sc.nextInt();


        //print initial array
        for (i = 0; i<length; i++){
            digits[i] = random.nextInt(origin,bound); 
            System.out.println(digits[i]); 
        }
        
        //
    }

    
}
