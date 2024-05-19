public class problem6{

    static int find_lcd(int n1, int n2){
        if(n1 == 0 ){
            return n2;
        }else if(n2 ==0){
            return n1; 
        }else {
            if(n1 >= n2){
                return find_lcd(n2, n1%n2); 
            }else{
                return find_lcd(n1, n2%n1); 
            }
            
        }
    }
    public static void main (String[] args){
        System.out.print(find_lcd(3,15)); 

    }
}