package p4;

public class problem4 {

    // return the minimum element in a[]
    static int findmin(int a[], int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (min < a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    static int findsum(int a[], int n) {
        int sum = a[0];
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] a = {0,1,2,3,4,5}; 
        int n = a.length; 

        System.out.println("Find min: "); 
        System.out.print(findmin(a, n)); 

        System.out.println("\nFind sum: "); 
        System.out.print(findsum(a, n)); 

    }
}
