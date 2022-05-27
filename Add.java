package codeitup;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Add {
    public static void main(String[] args)throws IOException {
//        int a,b,sum;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter First Num: ");
//        a = Integer.parseInt(br.readLine());
//        System.out.print("Enter Second Num: ");
//        b = Integer.parseInt(br.readLine());
//        sum = a+b;
//        System.out.println(sum);
        Add aa = new Add();
        aa.shape();
    }

    void shape(){

        int i, j, k, n=5, count=0,a;
        for(i=1; i<=n; i++){
            for (j=1; j<=n-i;j++)
                System.out.print("_");
            for (k=1; k<=i+count; k++)
                System.out.print(i);
            count = count+1;
            for (a=1; a<=n-i;a++)
                System.out.print("_");
            System.out.println();
        }







        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        int m=1, i, j, count =0;

        while (m<=num){
            for (i=1;i<=num-m;i++)
                System.out.print(" ");
            for (j=1;j<m+1;j++){
                System.out.print("*");
            count= count+1;}
            System.out.println();
            m++;
        }
        System.out.println(count);

                *
               **
              ***
             ****
            *****                       */

  /*      int i=0,j;
        while(i<5){
         for (j=0; j<=i; j++)
            System.out.print(i);
            System.out.println();
            i++;
            }
            *
            **
            ***
            ****
            *****
            */

 /*       for (i=5; i<=5;i--){
            for (j=0;j<i;j++){
                if (j<i-1)
                    System.out.print("*");
                else
                    System.out.println(" ");
            }
        }
        *****
        ****
        ***
        **
        *                   */
    }


}
