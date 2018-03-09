import java.util.Scanner;
public class ScannerDemo{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        // int num;
        // double numd;
        // num=in.nextInt();
        // System.out.println("Entered number is: "+num);
        // numd=in.nextDouble();
        // System.out.println("Entered number is: "+numd);
        String str=null;
        // str=in.next();
        str=in.nextLine();
        System.out.println("You have Entered: "+str);
    }
}