import java.util.ArrayList;
import java.util.List;

public class problem8 {

    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generate(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }
        // System.out.println("Size 1: " +subsets.size());


        // Include the current element
        currentSubset.add(nums[index]);
        generate(nums, index + 1, currentSubset, subsets);

        // System.out.println("Size 2: " +subsets.size());

        // Exclude the current element
        currentSubset.remove(currentSubset.size() - 1);
        generate(nums, index + 1, currentSubset, subsets);
        // System.out.println("Size 1: " +subsets.size());
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = generateSubsets(nums);
        printSubsets(allSubsets);
    }

    private static void printSubsets(List<List<Integer>> subsets) {
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
