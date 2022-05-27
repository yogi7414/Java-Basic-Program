package rahul_prog;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci Series
        long a=0,b=1,sum;
        System.out.println("This is a Fibonacci Series");
        System.out.println("Lets Start");

        for (int i=0;i<10;i++){
        sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
