public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr1 = new OrdArray(maxSize);
        OrdArray arr2 = new OrdArray(maxSize);

        // Insert random numbers into the source arrays
        for (int i = 0; i < 10; i++) {
            arr1.insert((long) (Math.random() * 100));
            arr2.insert((long) (Math.random() * 100));
        }

        // Display the source arrays
        System.out.println("Source Array 1:");
        arr1.display();
        System.out.println("Source Array 2:");
        arr2.display();

        // Merge the source arrays into a destination array
        OrdArray mergedArray = new OrdArray(maxSize * 2); // Create a destination array
        mergedArray.merge(arr1, arr2);

        // Display the contents of the resulting destination array
        System.out.println("Merged Array:");
        mergedArray.display();
    }
}
