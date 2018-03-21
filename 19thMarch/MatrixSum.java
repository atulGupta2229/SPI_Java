import java.util.Scanner;

public class MatrixSum{
	public static void main(String arg[]){
		int[][] mat1=new int[3][3];
		int[][] mat2=new int[3][3];
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the first array(3x3): ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				mat1[i][j]=in.nextInt();
			}
		}
		
		System.out.println("Enter the second array(3x3): ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				mat2[i][j]=in.nextInt();
			}
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(mat1[i][j]+mat2[i][j]+"  ");				
			}
			System.out.println();
		}		
				
	}
}