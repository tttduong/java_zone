public class problem2 {

    //: Complete the Java code to recursively evaluate the sum: sum = 1 + 1/2 + 1/3 +...+1/n, n > 1.
    static double sum(int n) 
    {
        if (n<1)
            return 0.0;
        return 1.0/n + sum(n-1);
    }


    public static void main(String[] args){
        System.out.print(sum(5)); 

    }
}
