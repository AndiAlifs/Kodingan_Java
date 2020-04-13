import java.util.ArrayList;

public class Non_member extends Pelanggan{
    public Non_member(String nama, String noKTP, String noTelp, String Alamat,boolean isWeekend, ArrayList<Integer> daftarKamar, ArrayList<Integer> daftarMakan, ArrayList<Integer> daftarFasilitas){
        super(nama, noKTP, noTelp, Alamat, isWeekend, daftarKamar, daftarMakan, daftarFasilitas);
        setJumlahMaxKamar(3);
        setJenisMember("Non Member");
        aturVocerMakan(daftarKamar);
        aturVocerFasilitas(daftarKamar);
        aturDiskon();
        updateMakanDanFasilitas();
    }

    public void aturVocerMakan(ArrayList<Integer> daftarKamar){
        int bf = 0;
        int lu = 0;
        int di = 0;
        for (int i = 0;i<daftarKamar.size();i++){
            if(daftarKamar.get(i) == 1){
                bf++;
            } else if (daftarKamar.get(i) == 2){
                bf += 2;
            } else {
                bf += 6;
            }
        }
        tambahVocerMakan(bf);
        tambahVocerMakan(lu);
        tambahVocerMakan(di);
    }

    public void aturVocerFasilitas(ArrayList<Integer> daftarKamar){
        int kr = 0;
        int spa = 0;
        int sau = 0;
        tambahVocerFasilitas(kr);
        tambahVocerFasilitas(spa);
        tambahVocerFasilitas(sau);
    }

    public void aturDiskon(){
        long temp = 0;
        setDiskonMember(temp);
    }
}