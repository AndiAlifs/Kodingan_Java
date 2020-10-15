import java.util.LinkedList;
import java.util.*;
public class asd1 {

    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        LinkedList siswa = new LinkedList();
        siswa.add("ahmad");
        siswa.add("joko");
        siswa.add("susilo");
        siswa.add("bambang");

        System.out.print("Masukkan nama yang ingin dicek : ");
        String nama = scan.next();

        //mengecek apakah nama sudah ada di list atau tidak
        for (int i=0;i<siswa.size();i++){
            if(nama.equals(siswa.get(i))){
                System.out.printf("%s sudah ada dalam database",nama);
                break;
            } else if (i == siswa.size()-1){
                System.out.printf("%s belum ada dalam database",nama);
            }

        }
    }
}
