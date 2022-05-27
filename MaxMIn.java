import java.util.Scanner;
class MaxMin{
	public static void main(String[] args){
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Num: ");
		a = sc.nextFloat();
		
		System.out.print("Enter Second Num: ");
		b = sc.nextFloat();
		
		System.out.print("Enter Third Num: ");
		c = sc.nextFloat();
		if ( a > b && a > c)
		System.out.println(a+" Is Max");
		else if(b > a && b >c)
		System.out.println(b+" Is Max");
		else
		System.out.println(c+" Is Max");
	}
}