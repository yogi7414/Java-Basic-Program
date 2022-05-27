package rahul_prog;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Num which you want to factorial.");
        System.out.print("Enter A Num: ");
        int a = sc.nextInt();
        for (i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    int Factorialnum (int n){
        if (n==1){
            return 1;
        }else {
            return (n * Factorialnum(-1));
        }
    }

}
