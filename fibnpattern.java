import java.util.*;
public class fibnpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<n;i++)
        {
            int n3=n1+n2;
            for(int j=0;j<n3;j++)
            {
                System.out.print(n3+" ");
            }
            n1=n2;
            n2=n3;
            System.out.println();
        }
    }
}
