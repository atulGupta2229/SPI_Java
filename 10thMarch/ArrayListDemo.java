import java.util.ArrayList;
public class ArrayListDemo{
    public static void main(String args[]){
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(1);
       list.add(0,25);
       list.add(32);
       list.set(0, 45);
       list.remove(0);
       for(int i=0; i<2;i++){
           System.out.println(list.get(i));
       }
    }
}