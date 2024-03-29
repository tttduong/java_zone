public class Cau_1 {
    public static int ArrayToNumber(int[] digits) {
        int number = 0;
        int power = digits.length - 1;

        for(int digit : digits) {
            number += digit * Math.pow(10, power);
            power--;
        }
        return number;
    }

    public static void main(String[] args) {
        int[] digits = {2, 0, 1, 8};
        int outcome = ArrayToNumber(digits);
        System.out.println("Outcome: " + outcome);
    }

}