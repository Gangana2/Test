import java.util.*;
public class Scanner4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("num1 :");
        int num1 = input.nextInt();
        System.out.print("num2 :");
        int num2 = input.nextInt();
        System.out.print("num3 :");
        int num3 = input.nextInt();

        Double Avarage = (double)(num1+num2+num3)/3;

        System.out.println("Average is: "+Avarage);

    }
    
}
