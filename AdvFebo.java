import java.util.*;

class AdvFebo{
    public static void main(String[] args){
        Scanner ran=new Scanner(System.in);
        int n=ran.nextInt();
        int result=AdvFebo(n);
        System.out.println(result);
    }
    static int AdvFebo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return AdvFebo(n-1)+AdvFebo(n-2);
    }
}