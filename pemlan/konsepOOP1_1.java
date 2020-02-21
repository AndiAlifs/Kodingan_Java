class mobil{
    public String warna;
    public int kecepatan;
    public void cetakAttribut(){
        System.out.printf("%-10s: %s%n","Warna",warna);
        System.out.printf("%-10s: %s","kecepatan",cekKecepatan());
    }
    int cekKecepatan(){
        return kecepatan;
    }
} 

public class konsepOOP1_1{
    public static void main(String[] args) {
        i = 'a'
        mobil x_pander = new mobil();
        x_pander.kecepatan = 20;
        x_pander.warna = "Merah";
        x_pander.cetakAttribut();
    }
    
}
