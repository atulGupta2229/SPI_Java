public class StringDemo{
    public static void main(String args[]){
        String fname="Ashutosh";
        String lname="Umrao";
        String FullName=String.join(" ", fname, lname);
        System.out.println(FullName);
        System.out.println(fname.substring(0,4));
    }
}