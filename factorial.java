import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
    int a=1;
    int fact=1;
    System.out.println("enter number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        fact  *= i;
    }
    System.out.println(fact);
    }
}
