import java.util.Scanner;

public class TugasAkhir_PakAfif{

    static long pajak(long gaji){
        double pajak = 0.025 * gaji;
        return (long)pajak;
	  }

    public static void main(String[] args) {
        long[] gajiKotor=new long[5];
        long[] gajiBersih=new long[5];
        Scanner in = new Scanner (System.in);
        for (int i=0;i<5;i++){
          System.out.printf("Gaji Kotor Karyawan #%d : Rp.",i+1);
          gajiKotor[i]=in.nextLong();
          gajiBersih[i]=gajiKotor[i]-pajak(gajiKotor[i]);
        };
        System.out.println();
        for (int i=0;i<5;i++){
          System.out.printf("Gaji Karyawan #%d : Rp.%d",i+1,gajiBersih[i]);
          System.out.println();
        };
    }
}
