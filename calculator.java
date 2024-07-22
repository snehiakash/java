
public class calculator {
    public static void main(String args[]){
    int select=1;
     int a=5,b=3;
     int res;
    switch(select){
        case 1:res=(a+b);
        System.out.println(res);
        break;
        case 2:res=(a-b);
        System.out.println(res);
        break;
        case 3: res=(a*b);
        System.out.println(res);
        break;
        case 4: res=(a/b);
        System.out.println(res);
        
        Default:System.out.println("Invalid Input");
        break;
    }
    }
}

