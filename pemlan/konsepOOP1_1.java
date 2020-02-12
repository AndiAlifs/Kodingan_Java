
public class konsepOOP1_1{

    public static class mobil{
        public String warna;
        public int kecepatan;
        public void cetakAttribut(){
            System.out.println("Warna : "+warna);
            System.out.println("kecepatan : "+cekKecepatan());
        }
        int cekKecepatan(){
            return kecepatan;
        }
    }

    public static void main(String[] args) {
        mobil x_pander = new mobil();
        x_pander.kecepatan = 20;
        x_pander.warna = "Merah";
        x_pander.cetakAttribut();
    }
}
