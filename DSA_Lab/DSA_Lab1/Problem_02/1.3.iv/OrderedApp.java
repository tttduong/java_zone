public class OrderedApp {
    public static void main(String[] args) {
        int max = 100;
        OrdArray array1 = new OrdArray(max);
        OrdArray array2 = new OrdArray(max);

        for (int i = 0; i < 10; i++) {
            array1.insert((long)(Math.random()*100));
            array2.insert((long)(Math.random()*100));
        }

        System.out.println("Sourced Array 1:");
        array1.display();
        System.out.println("Sourced Array 2:");
        array2.display();

        OrdArray merge_array = new OrdArray(max * 2); 
        merge_array.merge(array1, array2);
        System.out.println("Merged for 2 Arrays:");
        merge_array.display();
    }
}
