public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] > value) {
                break;
            }
        }
        for (int k = nElems; k > j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems - 1; k++) {
                a[k] = a[k + 1];
            }

            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public void merge(OrdArray array1, OrdArray array2) {
        int length1 = array1.size();
        int length2 = array2.size();
        int pos1 = 0, pos2 = 0;
        int pos = 0;
        while (pos1 < length1 && pos2 < length2) {
            if (array1.a[pos1] < array2.a[pos2]) {
                a[pos++] = array1.a[pos1++];
            } else {
                a[pos++] = array2.a[pos2++];
            }
        }
    
        while (pos1 < length1) {
            a[pos++] = array1.a[pos1++];
        }
    
        while (pos2 < length2) {
            a[pos++] = array2.a[pos2++];
        }
        nElems = length1 + length2; // Update the number of elements in the merged array
    }
    
}
