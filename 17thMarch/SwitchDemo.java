import java.util.Scanner;

public class SwitchDemo{
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);		
		int choice;
		System.out.println("Enter your choice (1/2)");
		choice=in.nextInt();
		switch(choice){
			case 1: 
				System.out.println("You chose 1 as your choice!!");
				break;
			case 2:
				System.out.println("You chose 2 as your choice!!");
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
	}
}