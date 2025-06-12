import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        if(d%4==0){
            System.out.println(d+"is leapyear");

        }
        else{
            System.out.println(d+"is not leapyear");
        }
    }

    
}
