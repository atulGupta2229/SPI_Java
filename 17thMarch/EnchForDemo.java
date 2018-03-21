public class EnchForDemo{
	public static void main(String arg[]){
		int[] ar=new int[10];
		for(int i=0;i<10;i++){
			ar[i]=i;
		}

		for(int i: ar){
			System.out.println(i);
		}
	}
}