public class Cau_3 {
    public static void main(String[] args) {
        int[] arrays = {1, 3, 6, 7, 12};
        int outcome = MinGap(arrays, arrays.length);
        System.out.println("Outcome: " +outcome);
    }

    public static int MinGap(int[] arrays, int n) {
        if(n < 2) {
            return 0;
        }
        int minGap = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            int gap = arrays[i] - arrays[i-1];
            if(gap < minGap) {
                minGap = gap;
            }
        }
        return minGap;
    }
}
