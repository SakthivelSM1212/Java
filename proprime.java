import java.util.*;
public class proprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int num = sc.nextInt();
        int flag;
        int arr[]=new int[n];
        int index=0;
        for(int i=1;i< n;i++)
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
                arr[index] = i;
                index++
                ;
            }
        }
        for (int i = 0; i < index; i++) {
            flag = 1;
            for (int j = 0; j < index; j++) {
                if(arr[i] * arr[j] == n)
                {
                    System.out.println(arr[i] + " " + arr[j]);
                    flag = 0;
                    break;
                }
            }
            if(flag == 0)break;
        }
        // for (int i = 0; i < index; i++) {
        //     System.out.println(arr[i]);
        // }
    }
}
