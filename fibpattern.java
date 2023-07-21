import java.util.*;
public class fibpattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            int range = in.nextInt();
            int n1 = 0, n2 = 1, n3;
            System.out.println(n1 + "\n" + n2);
            for (int i = 2; i < range; i++) {
                n3 = n1 + n2;
                for (int j = 0; j < n3; j++) {
                    System.out.print(n3+" ");
                }
                n1 = n2;
                n2 = n3;
                System.out.println();
            }
            in.close();
}
}
