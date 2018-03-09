public class LoopsDemo{
    public static void main(String args[]){
        int i;
        for(i=0; i<10;i++){
            System.out.println("val"+i);
        }
        i=0;
        while(i<10){
            System.out.println("value"+i);
            i++;
        }
        i=1;
        do{
            System.out.println("doValue"+i);
            i++;
        }while(i==0);
        String str="str1";
        switch(str){
            case "str1":
            System.out.println("It works");
            break;
            default:
            System.out.println("It doesn't works");
            break;
        }
    }
}