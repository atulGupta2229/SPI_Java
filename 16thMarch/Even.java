public class Even{
	public static void main(String ar[]){
		int[] even=new int[25];
		int index=0;
		for(int i=1; i<=50; i++){
			if(i%2==0){
				even[index]=i;
				index++;	
			}
		}
		for(int i=0;i<25;i++){
			System.out.println(even[i]);
		}
	}
}