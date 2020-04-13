import java.util.ArrayList;

public class Member extends Pelanggan{
    public Member(String nama, String noKTP, String noTelp, String Alamat,boolean isWeekend, ArrayList<Integer> daftarKamar, ArrayList<Integer> daftarMakan, ArrayList<Integer> daftarFasilitas){
        super(nama, noKTP, noTelp, Alamat, isWeekend, daftarKamar, daftarMakan, daftarFasilitas);
        setJumlahMaxKamar(5);
        setJenisMember("Member");
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
                lu++;
            } else if (daftarKamar.get(i) == 2){
                bf += 2;
                lu += 2;
            } else {
                bf += 6;
                lu += 6;
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
        for (int i = 0;i<daftarKamar.size();i++){
            if(daftarKamar.get(i) == 1){
                kr++; 
            } else if (daftarKamar.get(i) == 2){
                kr += 2;
            } else {
                kr += 6;
            }
        }
        tambahVocerFasilitas(kr);
        tambahVocerFasilitas(spa);
        tambahVocerFasilitas(sau);
    }

    public void aturDiskon(){
        boolean week = isWeekend();
        long temp = 0;
        if (!week){
            double disc = 1.00 * 0.05 * getTotalBiayaKamar();
            temp += disc;
        }
        setDiskonMember(temp);
    }
    
}