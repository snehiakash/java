import java.util.Scanner;
import java.util.*;
public class primeno {
    public static void main(String args[]){
        int n;
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2!=0 && n%3!=0)
            {
            System.out.println("prime no");}
            else
            {
            System.out.println("not prime");
            }
        
    }
}
