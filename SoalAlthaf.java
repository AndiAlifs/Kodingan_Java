import java.util.Scanner;

public class SoalAlthaf{
    public static void main(String[] args) {
      for (int i=5;i>=1;i--){ //perulangan utk outputin per baris
        for (int x=5-i;x>0;x--){ //perulangan outputin spasi agar membentuk segitiga
          System.out.print(" ");
        }
        for (int j=1;j<=i;j++) { //perulangan untuk outputin bintang sebanyak baris saat
          System.out.print("* ");
        }
      System.out.println(); //print baris baru
      }
    }
}
