import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sqofnum = num * num;

        int revnum = 0;
        int temp = num;
        while(temp != 0){
            revnum = revnum * 10 + temp % 10;
            temp = temp / 10;
        }

        int sqofrevnum = revnum * revnum;

        int revofsqofrevnum = 0;
         temp = sqofrevnum;
        while(temp!=0){
            revofsqofrevnum = revofsqofrevnum * 10 + temp% 10;
            temp/= 10;
        }

        if(sqofnum == revofsqofrevnum){
            System.out.println(num + " is Adams num");
        }else{
            System.out.println(num + " is not Adams num");
        }
    }
}