import java.util.*;

public class sum{
    public static void main(String[]args){
        System.out.print("Enter a number that you want to insert: ");
        Scanner dc = new Scanner(System.in);
        int a = dc.nextInt();
        System.out.print("Enter you 2 number: ");
        int b = dc.nextInt();
        int c;
        c  =  a + b;
        System.out.print(c);
        dc.close();
    }
}
