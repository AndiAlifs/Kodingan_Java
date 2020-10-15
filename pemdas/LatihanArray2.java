import java.util.*;
public class LatihanArray2 {
    public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            int joko=in.nextInt();
            int array[] = new int[10];

            for (int i=0;i<array.length;i++){
              array[i]=in.nextInt();
            }
            
            for (int i=0;i<array.length;i++){
              if (array[i]==joko) {
                System.out.print(array[i]+" ");
                 break;
              } else {
                System.out.print(array[i]+" ");
              }
            }
    }
}
