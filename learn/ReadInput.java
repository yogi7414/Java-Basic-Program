package calculater.simply.learn;

import java.util.Scanner;

public class ReadInput {
    public static String read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input expression (For eg: 4*3/2): ");
        String inputLine = sc.nextLine();
        sc.close();
        return inputLine;
    }
}
