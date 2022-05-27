import java.util.Scanner;
class WhileFact{
	public static void main(String [] args){
		
		
		/*********************************************************************************************
		***********************************Factorial**************************************************
		*********************************************************************************************/
		int i=1,j,fact=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		j = sc.nextInt();
	while( i<=j){
		fact = fact*i;
		i++;
	}
	System.out.println("Factorial of "+j+" Is: "+fact);



//		for(int i=1; i<=10; i++){
//			System.out.println(i);
//		}
	}
}