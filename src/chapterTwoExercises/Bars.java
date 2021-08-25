import java.util.Scanner;
public class Bars 
{

    public static void main(String[] args) 
    {
        int i, j, n = 0; 

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number between 1 and 30 ");
        for (i = 0; i < 5; i++) {   
            n = input.nextInt();
            if (n > 30 || n < 1) {  
                System.out.println("Number out of limits, enter a number between 1 and 30 ");
                n = input.nextInt();
			if (i == 5)
			break;
            }
            for (j = 0; j< n; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println(); 
    }
}