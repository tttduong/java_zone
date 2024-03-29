import java.util.Random;

public class OrderedApp {
    private static int nElems = 10;
    private static int max = 100;
    private static long[] firstArray = new long[nElems];
    private static long[] secondArray = new long[nElems];

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < nElems; i++) {
            firstArray[i] = random.nextInt(max) + 1;
            secondArray[i] = random.nextInt(max / 2) + 1;
        }
        OrdArray array1 = new OrdArray(nElems);
        for (int i = 0; i < nElems; i++) {
            array1.insert(firstArray[i]);
        }

        OrdArray array2 = new OrdArray(nElems);
        for (int i = 0; i < nElems; i++) {
            array2.insert(firstArray[i]);
        }

        array2.merge(array1, array2);
        array2.display();

    }

}
