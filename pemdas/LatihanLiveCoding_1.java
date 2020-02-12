import java.util.*;
public class LatihanLiveCoding_1 {
    public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            int x = in.nextInt();
            int jumlah = 0;
            int bil_awal, bil_akhir;
            for (int i=10;i<=x;i++){
                bil_awal = i/10;
                bil_akhir = i % 10;
                if ((x%(bil_awal + bil_akhir))==0) System.out.println(i);
            };
            System.out.println(jumlah);
    }
}
