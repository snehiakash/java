import java.util.*;
import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        System.out.println("Enter a Number");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int factorial=1;
        while(n!=0)
        {
            factorial=factorial*n;
            n--;
        }
        System.out.println(factorial);
    }
}
