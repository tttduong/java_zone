import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Josephus suicide = new Josephus();
        Scanner sc = new Scanner(System.in); 
        int num_of_people, count_num, start; 

        System.out.println("Enter the number of people in the circle: "); 
        num_of_people = sc.nextInt(); 
        suicide.setNumOfPeople(num_of_people);  
        suicide.addPeople();
        suicide.display();

        System.out.println("Enter the number used for counting off:  ");
        count_num = sc.nextInt(); 
        suicide.setCountNum(count_num);

        System.out.println("Enter the number of the person where counting starts:  ");
        start = sc.nextInt();
        suicide.setStart(start); 


        System.out.println("Elimination order: \n");  
        suicide.execute();
        System.out.println("Last person standing: " + suicide.getLastNum()); 
         
        
        
        

    }

}