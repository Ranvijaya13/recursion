import java.util.*;

class BasicFebo{
    public static void main(String[] args){
        Scanner ran =new Scanner(System.in);
        int a=0,b=1;
        int n=ran.nextInt();
        doFebo(a,b,n);
    }
    static void doFebo(int a,int b,int n){
        if(n==0){
            return;
        }
        else if(a==0){
            System.out.println(a);
        }
        else if(b==1){
            System.out.println(b);
        }
        int c=a+b;
        System.out.println(c);
        doFebo(b,c,n-1);
    }
}