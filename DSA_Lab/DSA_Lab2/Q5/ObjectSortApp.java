package Q5;

public class ObjectSortApp {
    public static void main(String[] args) {
        int maxSize = 100; // array size
        ArrayInObject arr; // reference to array
        arr = new ArrayInObject (maxSize); // create the array

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Doc", 59);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Smith", "Paul", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        System.out.println("Before sorting:");
        arr.display(); // display items

        System.out.println();
        arr.insertionSort_Last();
        System.out.println("After sorting according to Last Name:");
        arr.display();
        System.out.println();

        arr.insertionSort_First();
        System.out.println("After sorting according to First Name:");
        arr.display();
        System.out.println();

        arr.insertionSort_Age();
        System.out.println("After sorting according to Age:");
        arr.display();
    }
}
