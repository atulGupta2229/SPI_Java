import java.util.Scanner;
public class OOPdemo1{
      static int add(int a, int b){
		return a+b;
	}

	static int x=2;

	public static void main(String arg[]){
	 Scanner a=new Scanner(System.in);
	 System.out.println("enter 2 number");
		int num1,num2, sum;

              num1=a.nextInt();
               num2=a.nextInt();
		sum=add(num1, num2);
		System.out.println(sum*x);
	}
}