public class Array2dDemo{
	public static void main(String arg[]){
		String[][] ar=new String[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				ar[i][j]="("+i+","+j+") ";
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}

	}
}