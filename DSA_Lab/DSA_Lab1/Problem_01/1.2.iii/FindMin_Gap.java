public class FindMin_Gap {
    
    public static int min_Gap(int[] arrays, int n) {
        if(n < 2) {
            return 0;
        }
        int min_gap = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            int gap = arrays[i] - arrays[i-1];
            if(gap < min_gap) {
                min_gap = gap;
            }
        }
        return min_gap;
    }

    public static void main(String[] args) {
        int[] arrays = {1, 3, 6, 7, 12};
        int min_gap = min_Gap(arrays, arrays.length);
        System.out.println("Min_Gap: " +min_gap);

    }
}
