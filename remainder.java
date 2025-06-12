import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int Q=a/b;
        int r=a%b;
        System.out.println("Quotient is"+ Q);
        System.out.println("remainder is"+ r);

    }
    
}
