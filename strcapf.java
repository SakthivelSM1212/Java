import java.util.*;
public class strcapf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cnt= 0;
        int n = s.length();
        char ch[] = s.toCharArray();
        int res_ind = 0; 
        for (int i = 0; i < n; i++) 
        {}
            if (ch[i] == ' ')
            {
                cnt++;
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                continue;
            }
            else
            {
                ch[res_ind++] = ch[i]; 
            }
              
    }
}

