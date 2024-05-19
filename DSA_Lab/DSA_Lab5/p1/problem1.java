public class problem1 {

    static int puzzle(int base, int limit) { // base and limit are nonnegative numbers
        if (base > limit) {
            return -1;
        } else if (base == limit) {
            return 1;
        } else {
            return base * puzzle(base + 1, limit);
        }
    }

    public static void main(String[] args) {

        /*
         * 1. Identify the base case(s) of function puzzle(..)
         *      (base > limit) , (base == limit)
         * 2. Identify the recursive case(s) of function puzzle(..)
         *      The other case: (base < limit)
         * 
         */
        System.out.print("\n3a:");
        //---------------------3a------------------------
        System.out.print(puzzle(14,10));

        System.out.print("\n3b:");
        //---------------------3b------------------------
        System.out.print(puzzle(4,7));

        System.out.print("\n3c:");
        //---------------------3c------------------------
        System.out.print(puzzle(0,0));

    }
}