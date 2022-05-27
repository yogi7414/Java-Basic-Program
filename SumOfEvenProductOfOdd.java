import java.util.Scanner;
class SumOfEvenProductOfOdd{
	public static void main(String [] args){
				
		int j,sum=0,multi=1,digit;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		j = sc.nextInt();
		while (j>0){
			digit = j%10;
			if(digit % 2 == 0)
				sum = sum + digit;
			else
				multi = multi * digit;
			j = j/10;
			}
			System.out.println("Sum Of Digit is: "+sum);
			System.out.println("Multiplication Of Digit is: "+multi);
			
}
}