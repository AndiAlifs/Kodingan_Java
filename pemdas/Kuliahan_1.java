import java.util.Scanner;
public class Kuliahan_1 {



static long fibo(int x){
    if(x==1) return 0; else
    if(x==2) return 1; else
    return fibo(x-1) + fibo(x-2);
}

 public static void main(String[] args ){
            Scanner scan = new Scanner(System.in);
            int angka = scan.nextInt();
            for (int i = 1;i<=angka;i++){
              System.out.printf("%d ",fibo(i));
            };


  }
}
