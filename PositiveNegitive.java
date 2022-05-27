import java.util.Scanner;
class PositiveNegitive{
	public static void main(String[] args){
		int num;
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Num: ");
		num = sc.nextInt();
		if(num>0)
		System.out.print(num+" Is Positive");
		else if (num<0)
		System.out.print(num+" Is Negitive");
		else 
			System.out.print(num+" Is Zero");
	}
}