import java.util.Random;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0;
        int j;
        long searchKey;
        Random random = new Random();

        arr[0] = 77; /* insert 10 items */
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10; /* now 10 items in array */
        // --------------------------------------------------------------
        // for(j = 0; j < 100; j++) { /*Random Input 100 */
        // arr[j] = random.nextInt(100);
        // nElems++;
        // }
        // for(j = 0; j < nElems; j++) {
        // System.out.print(arr[j] + " ");
        // }
        // System.out.println("");

        // --------------------------------------------------------------
        searchKey = 66; /* find item with key 66 */
        int count = 0;
        for (j = 0; j < nElems; j++) {
            count = j;
            if (arr[j] == searchKey) {
                break;
            }
        }
        System.out.println("The number of finding items: " + count);
        if (j == nElems) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }
        // --------------------------------------------------------------
        searchKey = 55; /* delete item with key 55 */
        int delete = 0;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey)
                break;
        }

        for (int k = j; k < nElems - 1; k++) {
            delete++;
            arr[k] = arr[k + 1];
        }
        nElems--;
        System.out.println("The number of deleting item: " + delete);
        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        // --------------------------------------------------------------
        // long max = arr[0]; /*Delete a highest key */
        // int maxIndex = 0;
        // for(j = 0; j < nElems; j++) {
        // if(arr[j] > max) {
        // max = arr[j];
        // maxIndex = j;
        // }
        // }
        // System.out.println("The highest key: " +max);
        // System.out.println("The highest Index: " +maxIndex);
        // for(int k = maxIndex; k < nElems; k++) {
        // arr[k] = arr[k + 1];
        // }
        // nElems--;
        // for(j = 0; j < nElems; j++) {
        // System.out.print(arr[j] + " ");
        // }
        // System.out.println("");
    }
}