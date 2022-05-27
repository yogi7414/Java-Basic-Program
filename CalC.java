import java.util.Scanner;
class CalC{
	public static void main(String[] args){
	int a,b,op,ans;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Num: ");
		a = sc.nextInt();
		
		System.out.print("Enter First Num: ");
		b = sc.nextInt();
		System.out.println("Choose which operation you want to perform");
		System.out.print("Op. 1 = Addition: \nOp. 2 = Subtraction: \nOp. 3 = Multiplicaton: \nOp. 4 = Division: \n");
		op = sc.nextInt();
		if (op==1){
			ans=a+b;
			System.out.print("Addition is: "+ans);
		}
		else if (op==2){
			ans=a-b;
			System.out.print("Addition is: "+ans);
		}
		else if (op==3){
			ans=a*b;
			System.out.print("Addition is: "+ans);
		}
		else if (op==4){
			ans=a/b;
			System.out.print("Addition is: "+ans);
		}
		else{
			System.out.print("Invalid Choice");
		}


}
}