import java.util.Scanner;

public class Main195150401111048{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        int tier = scan.nextInt();
        int poin = scan.nextInt();
        int perjalanan = scan.nextInt();
        scan.close();
        System.out.println("");
        System.out.println("======Taksi Online Sanggoleo======");
        Pelanggan x;
        switch(tier){
            case 1: x = new NonTier(nama, poin, perjalanan);
            case 2: x = new BronzeTier(nama, poin, perjalanan);
            case 3: x = new SilverTier(nama, poin, perjalanan);
            case 4: x = new GoldTier(nama, poin, perjalanan);
        }
    }
}