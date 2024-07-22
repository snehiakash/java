import java.util.Scanner;

class First{
    public static void main(String args[])
    {

        System.out.println("Enter radius");
        Scanner sc=new Scanner(System.in);
       int Radius=sc.nextInt();
       double area=3.14*(Radius*Radius);
      System.out.println(area);
    }
}