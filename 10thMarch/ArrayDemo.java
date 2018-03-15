import java.util.Scanner;
public class ArrayDemo{
    public static void main(String args[]){
        int[] num={1,2,3,4};
        for(int i=0; i<4; i++){
            System.out.println(num[i]);
        }
        String[] names=new String[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
            names[i]=in.nextLine();
        }
        for(int i=0;i<3;i++){
            System.out.println(names[i]);
        }
    }
}