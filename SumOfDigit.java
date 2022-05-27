import java.util.Scanner;
class SumOfDigit{
	public static void main(String [] args){
				
		int j,sum=0,arm=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		j = sc.nextInt();
		while (j>0){
			sum = sum+j%10;
			j=j/10;
			//arm=j*3;
			}
			System.out.println("Sum Of Digit is: "+sum);
			//System.out.println("Sum Of Digit is: "+arm);
			
}
}