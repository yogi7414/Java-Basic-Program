import java.util.Scanner;
class WhileReverse{
		public static void main(String [] args){
			
		
		int j,rev=0, org;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		j = sc.nextInt();
		org=j;
		while (j>0){
			rev = (rev*10)+j%10;
			j=j/10;
			}
			if(org==rev)
			System.out.println("Num is Palindrome: "+org);
			else
				System.out.println("Reverse is: "+rev);
	}
}