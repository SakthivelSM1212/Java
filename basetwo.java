import java.util.*;
public class basetwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double res=0;
        for(int i=0;i<n;i++)
        {
            res=Math.pow(2,i);
            if(res==n)
            {
                break;
            }
        }
        if(res==n)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
