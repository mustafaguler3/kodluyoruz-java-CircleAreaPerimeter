import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int r ;
        double pi = 3.14 , centralAngle, area ;
         Scanner input = new Scanner(System.in);

       System.out.print("Please write the radius : ");
       r = input.nextInt();
       System.out.print("Please write the central angle : ");
       centralAngle = input.nextInt();
       area= (pi * (r * r) * centralAngle)/360 ;
       System.out.println("Your area is : " + area);

	}

}
