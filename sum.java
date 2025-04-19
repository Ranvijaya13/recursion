import java.util.*;

class sum{
    public static void main(String[] args){
        Scanner ran=new Scanner(System.in);
        int n=ran.nextInt();
        int result=doSum(n);
        System.out.println(result);
    }
    public static int doSum(int n){
        if(n==0){
            return 0;
        }
        return n+doSum(n-1);
    }
}