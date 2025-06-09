public class continue1 {
    public static void main(String[] args){
        int sum=0;
        for( int i=1;i<=100;i++){
            
            if(i==50){

                System.out.println(i);
                continue;
            
            }
            sum=sum+i;
        System.out.println(sum);
            
        }
    }
    
}
