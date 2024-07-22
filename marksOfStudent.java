import java.util.Scanner;
public class marksOfStudent {
    public static void main (String args[]){
        int choice;
        System.out.println("Enter Your choice");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
         System.out.println("Enter Your Marks");
          Scanner ref=new Scanner(System.in);
          int marks=ref.nextInt();
        switch(choice){
            case 1: if(marks>=90){
                System.out.println("This is good marks");
            }
                else if(marks>=60 && marks<=90)
                {
                    System.out.println("This is also a good marks");
                }
                else
                System.out.println("This is good as well");
                break;
                case 2:
                System.out.println("Stop");
                break;
            }
        }
    }

