public class ConvertorArrayToNumber {

    public ConvertorArrayToNumber(){}; 
    
    public static void convertArrayToNumber(int digits[]) {
        int length = digits.length; 
        int multi_num = 1;
        int num =0 ;    
          for (int i= length-1;  i >= 0; i--){
            num = num + digits[i]*multi_num;
            // System.out.println("Num = "+num );
            multi_num *= 10 ; 
            // System.out.println("multi_num = "+multi_num );
            // System.out.println(length); 
          }
        System.out.println("Number: "+ num); 
    }

public static void main (String[] args){
    int digits[] = {3,1,0,7}; 
    convertArrayToNumber(digits);

}
}
