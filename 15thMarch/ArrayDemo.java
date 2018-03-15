import java.util.Scanner;
public class ArrayDemo{
	public static void main(String arg[]){
		//int[] num={2, 5, 34, 26};
		String[] names=new String[3];
		Scanner sc=new Scanner(System.in);
                System.out.println("enter the array");
                for(int i=0;i<3;i++)
{
                names[i]=sc.nextLine();
}
                
				
		for(int i=0; i<3; i++){
			System.out.println(names[i]);
		}
	}
}