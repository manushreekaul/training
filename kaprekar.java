import java.util.Scanner;

public class kaprekar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;

        int digits = 0;
        int temp = num;
        while(temp != 0){
            temp /= 10;
            digits++;
        }

        int divisor = 1;
        for(int i = 0;i < digits;i++){
            divisor = divisor * 10;
        }
        int right = square % divisor;
        int left = square / divisor;
        if(left + right == num){
            System.out.println("Is Kaprekar");
        }else{
            System.out.println("Is not Kaprekar");
        }
    }
}
