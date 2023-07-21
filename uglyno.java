import java.util.*;
public class uglyno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++)
        {
          if(i<=5)
          {
            if(n%i==0)
            {
              count++;
            }
          }
          if(i>5)
          {
            if(i%i==0 && i%1==1)
            {
              if(n%i==0)
              {
                System.out.println("False");
              }
            }
          }
        }
        if(count<3){
        System.out.println("True");
        }
      }
    }
