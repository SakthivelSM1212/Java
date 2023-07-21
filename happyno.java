import java.util.*;
public class happyno {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int temp=0;
       temp=num;
       while(true)
       {
        int res=0;
        while(temp>0)
        {
        int rem=temp%10;
        res+=rem*rem;
        temp/=10;
        }
        if(res==1)
        {
            System.out.println("True");
            break;
        }
           temp=res;
       }
    }
}
