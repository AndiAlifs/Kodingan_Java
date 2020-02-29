import java.util.Scanner;

class Buku1{
    //deklarasi variabel sebagai attributes objek
    private String[] judul_b = new String[10];
    private long[] hargaStat_b = new long[10];
    private String[] penulis_b = new String[10];
    private double[] diskon_b = new double[10];
    private String[] kategori_b = new String[10];
    private long[] hargaAsli_b =new long[judul_b.length];
    private int[] stok_b = new int[10];

    //set data untuk attributes objek
    public void setAll(int n,int x){
        this.judul_b[x] = liveCoding2.getJudul(n);
        this.penulis_b[x] = liveCoding2.getPenulis(n);
        int temp = liveCoding2.getHarga(n);
        double disc = liveCoding2.getDiskon(n);
        this.hargaAsli_b[x] = (int)(temp - (temp*disc));
        this.stok_b[x] = liveCoding2.getStok(n);
    }

    //kosntruktor overloading parameter string
    public Buku1(String s){
        CariBuKu(s);
    }

    //kontruktor overloading parameter integer
    public Buku1(int s){
        CariBuKu(String.valueOf(s));
    }

    //method CariBuku untuk sebagai setter attributes objek
    public void CariBuKu(String s){
        int j=0;
        for (int i=0;i<15;i++){
            if (liveCoding2.getPenulis(i).equals(s)){
                setAll(i,j);
                j++;
            }
            if (liveCoding2.getJudul(i).equals(s)){
                setAll(i,j);
                j++;
            }
            if (liveCoding2.getKategori(i).equals(s)){
                setAll(i,j);
                j++;
            }
            if (String.valueOf(liveCoding2.getHarga(i)).equals(s)){
                setAll(i,j);
                j++;
            }
        }
    }

    //method untuk mengisi nilai setelah di dikurangi diskon
    public long setHargaAsli(long h,double d){
        double temp = h*d;
        long temp1 = h - (long)temp;
        return temp1;
    }

    //method untuk mengeluarkan attributes
    public void printAll(){
        for (int i=0; i<=10;i++) {
            if(this.stok_b[i]==0) break;
            System.out.printf("%-12s : %s%n","Judul Buku",this.judul_b[i]);
            System.out.printf("%-12s : %s%d%n","Harga Bersih","Rp.",this.hargaAsli_b[i]);
            System.out.printf("%-12s : %d%n","Stok",this.stok_b[i]);
        }
    }
}

//class utama
public class liveCoding2{

    //Deklarasi seluruh data
    private static String[] judul= {"Konfigurasi Wireless Routerboard Mikrotik","Instalasi & konfigurasi Jaringan Windows & Linux","Cepat Kuasai PHP dan MySQL","Pengantar Ilmu Sejarah","Runtuhnya Kerajaan Hindu-Jawa","Pemberontakan Indonesia Pada Masa Pendudukan Jeang","Filsafat Manusia","Pengantar Ilmu Filsafat","Filsafat Islam","Pemikiran dan Aktualisasi Pengembangan Pendidikan Islam" ,"Fiqih Sunnah","Ringkasan Shahih Muslim","Dasar - Dasar Ilmu Politik","Sistem Politik Indonesia","Memahami Ilmu Politik"};
    private static String[] penulis = {"Hardana","Bunafit Nugroho","Andreas","Kuntowijoyo","Slamet ","Akira Nagazumi dan Nasution","Abidin dan Zainal","Achmadi Asmoro","Al-Ghazali","Prof. Dr. H. Muhaimin","Imam Hasan Al-Banna","Abu Ahmadi","Miriam Budiarjo","PT Gramedia Pustaka Utama","Robert Michels"};
    private static int[] hargaStat={20000,50000,30000,15000,75000,50000,40000,95000,20000,45000,23000,60000,70000,50000,46000};
    private static double[] diskon = {0.20,0.05,0.15,0.03,0.25,0.04,0.07,0.06,0.15,0.07,0.05,0.09,0.40,0.45,0.78};
    private static String[] kategori = {"Teknologi","Teknologi","Teknologi","Sejarah","Sejarah","Sejarah","Filsafat","Filsafat","Filsafat","Agama","Agama","Agama","Politik","Politik","Politik"};
    private static int[] stok = {4,5,6,7,8,9,10,3,4,5,6,7,8,2,12};

    //getter diskon
    public static double getDiskon(int i){
        return diskon[i];
    }

    //getter penulis
    public static String getPenulis(int i){
        return penulis[i];
    }

    //getter kategori
    public static String getKategori(int i){
        return kategori[i];
    }

    //getter judul
    public static String getJudul(int i){
        return judul[i];
    }

    //getter harga
    public static int getHarga(int i){
        return hargaStat[i];
    }

    //getter stok
    public static int getStok(int i){
        return stok[i];
    }

    //method main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte n = 0;
        do {
            n = scan.nextByte();
            if(n==0) break;
            else if (n==2){
                int cari = scan.nextInt();
                Buku1 a = new Buku1(cari);
                a.printAll();
            }
            else {
                String cari = scan.nextLine();
                cari = scan.nextLine();
                Buku1 a = new Buku1(cari);
                a.printAll();
            }
        } while (true);
    }
}
