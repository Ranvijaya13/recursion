import java.util.*;

class KthCharacterGame{
    public static void main(String [] args){
        Scanner ran =new Scanner(System.in);
        int k=ran.nextInt();
        char ch=FindCharacter(k);
        System.out.println(ch);
    }
    static char FindCharacter(int k){
        String str="a";
        return Helper(k,str);
    }
    static char Helper(int k,String str){
        StringBuilder Nstr=new StringBuilder();
        if(str.length()<k){
            for(char c:str.toCharArray()){
                int ascii=(int)c;
                if(c=='z'){
                    Nstr.append(c);
                }
                else{
                    char ck=(char)(ascii+1);
                    Nstr.append(ck);
                }
            }
            str=str+Nstr;
            return Helper(k,str);
        }
        //System.out.println(str);
        return str.charAt(k-1);
    }
}