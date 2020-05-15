import java.util.InputMismatchException;
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean main = true;
        while (main) {
            try {
                System.out.println("======KALKULATOR======");
                System.out.print("Masukkan angka pertama : ");
                int x = scan.nextInt();
                System.out.print("Masukkan angka kedua : ");
                int y = scan.nextInt();
                System.out.println("1. Penambahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Pembagian");
                System.out.println("4. Perkalian");
                System.out.print("Masukkan Jenis Operasi : ");
                byte temp = scan.nextByte();
                if(temp==1) {
                    Matematika hasil = new Penambahan(x,y);
                    System.out.println(hasil);
                }
                else if(temp==2){
                    Matematika hasil = new Pengurangan(x,y);
                    System.out.println(hasil);
                }
                else if(temp==3) {
                    if (y == 0) System.out.println("Bilangan kedua tidak bisa 0");
                    else {
                        Matematika hasil = new Pembagian(x,y);
                        System.out.println(hasil);
                    }
                }
                if(temp==4) {
                    Matematika hasil = new Perkalian(x,y);
                    System.out.println(hasil);
                }
            }
            catch (InputMismatchException ex){
                System.out.println("Input harus merupakan angka");
                throw ex; 
            }
            finally{           
                    System.out.println("Program selesai");
            }
        }
        scan.close();
    }
}