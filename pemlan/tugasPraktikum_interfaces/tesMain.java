public class tesMain {
    public static void main(String[] args) {
        Invoice[] belanjaan = new Invoice[4];
        belanjaan[0] = new Invoice("roti isi",3,3000);
        belanjaan[1] = new Invoice("siomay",6,1000);
        belanjaan[2] = new Invoice("mie ayam maks",2,10000);
        belanjaan[3] = new Invoice("nasi ayam",3,8000);

        Payable karyawan = new Employee(1234512,"Jocko",2000000,belanjaan);
        System.out.print(karyawan);

        
    }
}