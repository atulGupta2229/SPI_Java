import java.util.Scanner;
class Hm1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter size of the array");
n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements in an array");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Elements of  array"+ar[i]);
        }
        System.out.println("Enter ur choice");
           System.out.println("Enter 1 for Ascending");
        System.out.println("Enter 2 for Descending");
        int ch=sc.nextInt();
        switch(ch)
        {
case 1:
int j,temp=0;
for(i=0;i<n;i++)
{
    for(j=i+1;j<n;j++)
    {
        if(ar[i]>ar[j])
        {
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
        }
    }
}
for(i=0;i<n;i++)
{
        System.out.println("Numbers in Ascending Order"+ar[i]);

}
break;
case 2:
int k,t=0;
for(i=0;i<n;i++)
{
    for(k=i+1;k<n;k++)
    {
        if(ar[i]<ar[k])
        {
            t=ar[i];
            ar[i]=ar[k];
            ar[k]=t;
        }
    }
}
for(i=0;i<n;i++)
{
        System.out.println("Numbers in Descending Order"+ar[i]);

}
break;
default:

      System.out.println("Wrong choice!!");
break;
        }
    }
}