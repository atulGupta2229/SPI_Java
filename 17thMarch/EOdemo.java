public class EOdemo{
	public static void main(String arg[]){
		int[] even=new int[25];
		int[] odd=new int[25];
		int inE=0;
		int inO=0;
		for(int i=1;i<=50;i++){
			if(i%2==0){
				even[inE]=i;
				inE++;
			}
			else{
				odd[inO]=i;
				inO++;							
			}
		}
		
		for(int i=0;i<25;i++){
			System.out.println("Even "+even[i]+" Odd "+odd[i]);
		}
	}
}