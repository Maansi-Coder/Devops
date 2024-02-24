import java.util.*;

public class practice{
    public static void display(int l[]){
        for (int i=0;i<l.length;i++){
            System.out.print(l[i]+" ");
        }
    }
    public static void main(String args[]){
        /*String s="pwwkeww";
        char str[]=s.toCharArray();
        String l[]= new String[20];
        
        for (int i=0;i<str.length;i++){
            String s1= String.valueOf(str[i]);
            for (int j=i+1;j<str.length;j++){
                if (s1.contains(String.valueOf(str[j]))){
                    l[i]=s1;
                    break;
                }else{
                    s1=s1.concat(String.valueOf(str[j]));
                }
            }
        } 

        int len= 0;
        for (int k=0;k<l.length;k++){
            if (l[k] != null){
                System.out.print(l[k]+"  ");
                if (l[k].length() > len){
                    len= l[k].length();
                }
            }
            else{
                break;
            }
        }
        System.out.println(len);*/
       
        int l[]={1,2,3,4};
        for (int i=0;i<l.length;i++){
            for (int j=i;j<l.length;j++){
                int newArr[] = Arrays.copyOfRange(l, i, j+1);
                display(newArr);
                System.out.println();
            }
            System.out.println();
        }

}
}