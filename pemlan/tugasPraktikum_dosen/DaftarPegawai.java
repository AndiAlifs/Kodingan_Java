
public class DaftarPegawai {
    Pegawai[] listPegawai = new Pegawai[7];

    public DaftarPegawai() {
        Pegawai a = new Dosen("Joko", "128352", "Lepo lepo", 10);
        a.sertifikasi();
        listPegawai[1] = a;
        a = new Dosen("Ahmed", "2531231", "Sigoera goera", 7);
        listPegawai[0] = a;
        a = new StaffAkademik("Jeki", "128352", "Baruangeng", 21);
        listPegawai[5] = a;
        a = new StaffAkademik("Jacky", "111312", "Bonggoeya", 19);
        a.sertifikasi();
        listPegawai[3] = a;
        a = new StaffKebersihan("Somedd", "826302", "Mekar Sari", 5);
        listPegawai[6] = a;
        a = new StaffKebersihan("Subadrun", "2038214", "Jalan Poros", 3);
        listPegawai[4] = a;
        a = new StaffKebersihan("Suhibda", "3462127", "Soehat", 1);
        listPegawai[2] = a;
    }

    public void printAll(){
        System.out.println("=======Daftar Gaji Pegawai=======");
        for (int i=0;i<listPegawai.length;i++){
            System.out.println(listPegawai[i]);
        }
        System.out.println("=================================");
    }

    public void printBisaSertif(){
        System.out.println("=======Daftar Pegawai Bisa Sertifikasi=======");
        for (int i=0;i<listPegawai.length;i++){
            if ((listPegawai[i].getJabatan().equals("Dosen")) || (listPegawai[i].getJabatan().equals("Staff Akademik"))){
                listPegawai[i].printTanpaGaji();
                System.out.println();
            };
        }
        System.out.println("=============================================");
    }

    public void printGajiSertif(){
        int temp = 0;
        System.out.println("=======Gaji Sertifikasi=======");
        for (int i=0;i<listPegawai.length;i++){
            if(listPegawai[i].getGajiSertifikasi() > 0){
                temp += listPegawai[i].getGajiSertifikasi();
                System.out.println(listPegawai[i]);
            }
        }
        System.out.printf("%-18s : Rp.%d%n","Total Gaji Sertifikasi",temp);
        System.out.println("=================================");
    }
}