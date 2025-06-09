import java.util.Scanner;
class fibonacci{
    public static void main(String[] args) {
        int a=0;
int b=1;
System.out.println("enter value of n");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

        for(int i=a+b;i<=n;i++){
            i=a+b;
            a=b;
            b=i;
            System.out.println(i);
        }
        
    }
}