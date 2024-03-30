package Q5;

public class ArrayInObject {
    private Person[] a;
    private int nElems;

    public ArrayInObject(int max) {
        a = new Person[max]; // create the array
        nElems = 0;
    }

    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            a[j].displayPerson();
    }

    public void insertionSort_Last() {
        int in, out;

        for (out = 1; out < nElems; out++) {
            Person temp = a[out];
            in = out;

            while (in > 0 && a[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    public void insertionSort_First() {
        int in, out;

        for (out = 1; out < nElems; out++) {
            Person temp = a[out];
            in = out;

            while (in > 0 && a[in - 1].getFirstName().compareTo(temp.getFirstName()) > 0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    public void insertionSort_Age() {
        int in, out;

        for (out = 1; out < nElems; out++) {
            Person temp = a[out];
            in = out;

            while (in > 0 && (a[in - 1].getAge()) > (temp.getAge())) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}
