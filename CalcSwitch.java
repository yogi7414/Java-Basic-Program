import java.util.Scanner;
class CalcSwitch{
	public static void main(String[] args){
	int a,b,op,ans;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Num: ");
		a = sc.nextInt();
		
		System.out.print("Enter First Num: ");
		b = sc.nextInt();
		System.out.print("Op. 1 = Addition: \nOp. 2 = Subtraction: \nOp. 3 = Multiplicaton: \nOp. 4 = Division: \n");
		op = sc.nextInt();
		
		switch(op){
			case 1: System.out.print("Addition is: "+(a+b));
			break;
			case 2: System.out.print("Subtraction is: "+(a-b));
			break;
			case 3: System.out.print("Multiplicaton is: "+(a*b));
			break;
			case 4: System.out.print("Division is: "+(a/b));
			break;
			default :System.out.print("Invalid Choice");
			break;
		}
		
	}
}