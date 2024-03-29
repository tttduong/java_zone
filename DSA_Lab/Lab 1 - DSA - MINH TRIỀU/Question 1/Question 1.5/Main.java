public class Main {
    public static void main(String[] args) {
        Student[] sts = new Student[5];
        sts[0] = new Student("Alice", 95);
        sts[1] = new Student("Bob", 75);
        sts[2] = new Student("Charlie", 50);
        sts[3] = new Student("David", 85);
        sts[4] = new Student("Eve", 40);

        int numberExcellent = 0, numberOK = 0, numberFailure = 0;
        int sumExcellent = 0, sumOK = 0, sumFailure = 0;

        for(Student st : sts) {
            System.out.println(st.getName());

            if(st.getGrade() > 89) {
                System.out.println("Excellent");
                numberExcellent++;
                sumExcellent += st.getGrade();
            } else if(st.getGrade() > 60 && st.getGrade() < 89) {
                System.out.println("OK");
                numberOK++;
                sumOK += st.getGrade();
            } else {
                System.out.println("Failure");
                numberFailure++;
                sumFailure += st.getGrade();
            }
            System.out.println();
        }

        System.out.println("Excellent count: " +numberExcellent);
        System.out.println("OK count: " +numberOK);
        System.out.println("Failure count: " +numberFailure);
        System.out.println();

        double averageExcellent = sumExcellent/numberExcellent;
        System.out.println("Average of Excelent: "+averageExcellent);
        double averageOK = sumOK/numberOK;
        System.out.println("Average of OK: "+averageOK);
        double averageFailure = sumFailure/numberFailure;
        System.out.println("Average of Failure: "+averageFailure);

        

        
    }
}
