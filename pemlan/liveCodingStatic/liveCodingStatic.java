import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Mahasiswa {

    //Deklarasi variabel yang diperlukan
        private String nama;
        private int nilai;
  		private static int jumlMahasiswa = 0;
        private static int totsNil = 0;
        private final static String matkuls = "pemograman lanjut" ;

    //Tentukan modifier variabel dibawah ini
    //deklarasi ArrayList akan menyimpan data dalam bentuk object
    	public static ArrayList<String> daftarMahasiswa = new ArrayList<String>();
    	public static ArrayList<Integer> nilaiMahasiswa = new ArrayList<Integer>();

 	//Deklarasikan Konstruktornya
    //konstuktor dengan parameter nama dan nilai
        public Mahasiswa(String nams, int nil){
            this.nama = nams;
            this.nilai = nil;
            jumlMahasiswa++;
            totsNil += nil;
            daftarMahasiswa.add(nams);
            nilaiMahasiswa.add(nil);
        }

    //konstuktor dengan parameter nama
        public Mahasiswa(String nams){
                this.nama = nams;
                this.nilai = 90;
                jumlMahasiswa++;
                totsNil += 90;
                daftarMahasiswa.add(nams);
                nilaiMahasiswa.add(90);
            }

    //Deklarasi method beserta modifiernya
    //getter Matakuliah
        public static String getMatakuliah(){
            return matkuls;
        }

    //getter atribut class static jumlMahasiswa
        public int getJumlah(){
            return jumlMahasiswa;
        }

    //getter atribut rata_rata setelah dikomputasi
        public double rata_rata(){
            double temp = (double)totsNil/(double)jumlMahasiswa;
            return temp;
        }

    //getter atribut nama
        public String getNama(){
            return this.nama;
        }

    //getter atribut nilai
        public int getNilai(){
            return this.nilai;
        }

  	//Deklarasi modifiernya
    public static void show(){
        for (int i = 0; i < daftarMahasiswa.size(); i++){
            System.out.printf("%s%s,%s%d\n", "Nama Mahasiswa : " , daftarMahasiswa.get(i) , " Nilai : " , nilaiMahasiswa.get(i));
        }
    }

}

public class liveCodingStatic {
   	//Jangan Merubah Code dibawah ini
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        input = stdin.readLine();
        Mahasiswa b = new Mahasiswa(input);
        while (!input.equals(" ")) {
            input = stdin.readLine();
            if(!input.equals(" ")){
                 String [] arr = input.split(" ");
                 Mahasiswa a = new Mahasiswa(arr[0],Integer.parseInt(arr[1]));
                 System.out.println(a.getNama()+" "+a.getNilai());
            }
        }
        System.out.println("Daftar Nilai Dari Matakuliah " + Mahasiswa.getMatakuliah());
        Mahasiswa.show();
        System.out.println("Jumlah Semua Mahasiswa : " + b.getJumlah());
        System.out.println("Rata-Rata nilai : " + b.rata_rata());
        stdin.close();
    }
}
