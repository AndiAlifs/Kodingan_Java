import java.util.ArrayList;

public class Premium extends Pelanggan{
    public Premium(String nama, String noKTP, String noTelp, String Alamat,boolean isWeekend, ArrayList<Integer> daftarKamar, ArrayList<Integer> daftarMakan, ArrayList<Integer> daftarFasilitas){
        super(nama, noKTP, noTelp, Alamat, isWeekend, daftarKamar, daftarMakan, daftarFasilitas);
        setJenisMember("Member Premium");
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
                di++; 
            } else if (daftarKamar.get(i) == 2){
                bf += 2;
                lu += 2;
                di += 2;
            } else {
                bf += 6;
                lu += 6;
                di += 6;
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
                spa++;
                sau++; 
            } else if (daftarKamar.get(i) == 2){
                kr += 2;
                spa += 2;
                sau += 2;
            } else {
                kr += 6;
                spa += 6;
                sau += 6;
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
            double disc = 1.00 * 0.1 * getTotalBiayaKamar();
            temp += disc;
        } else {
            double disc = 1.00 * 0.05 * getTotalBiayaKamar();
            temp += disc;
        }
        setDiskonMember(temp);
    }
}