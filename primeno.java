import java.util.*;
public class primeno {
    // public static int gcd(int n1,int n2){
    //     if(n1 == 0)
    //         return n2;
    //     return gcd(n2 % n1,n1);
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag;
        if(n==1 || n==0)
        {
            System.out.println("0");
        }
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            continue;
            flag=1;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(i+" ");
            }
        }
        
    }
}
