import java.util.Scanner;
class Length extends Add{
	public static void main(String[] args){
		int len, br, area,peri;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		len = sc.nextInt();
		System.out.print("Enter Breadth: ");
		br	 = sc.nextInt();
		area = len*br;
		System.out.println("Area Of Rectangle Is: "+area);
		peri = 2*(len+br);
		System.out.print("Perimiter Of Rectangle Is: "+peri);
		
	}
	Add aa= new Add();
	aa.m1();
	
}