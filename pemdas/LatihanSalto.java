import java.util.*;
import java.math.*;

public class LatihanSalto{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jaka = scan.nextInt();
        for (int i=1 ;i<=jaka;i++){
          for (int j=1;j<=jaka-i;j++){
            System.out.print(' ');
          }
          for (int k=1;k<=i;k++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }
}
