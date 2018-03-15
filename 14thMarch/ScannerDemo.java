import java.util.Scanner;

public class ScannerDemo{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String name;
		System.out.println("Enter a Name, Please: ");
		name=in.nextLine();
		System.out.println("wow, your name is, "+name+"?");	
	}
}