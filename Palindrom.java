package rahul_prog;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        int num,sum=0,temp;
        int aa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        aa = sc.nextInt();
        temp=aa;
        while(aa>0){
            num=aa%10;
            sum=(sum*10)+num;
            aa=aa/10;
        }
        if (temp==sum)
            System.out.println("Palindrome num");
        else
            System.out.println("not Palindrome");
    }


}
