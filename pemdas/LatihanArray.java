import java.util.*;
import java.math.*;

public class LatihanArray{
    static float inputData(){
        Scanner in = new Scanner (System.in);
        float data = in.nextFloat();
        return data;
    };
    static double hitungKuadrat(double x){
        double kuadrat = x*x;
        return kuadrat;
    };
    static double hitungRata2(float x,float y,float z){
        double rata = (x+y+z)/3.00;
        return rata;
    };
    static double hitungVariansi(float x,float y,float z){
        double perata = hitungRata2(x,y,z);
        double varians = (hitungKuadrat(x-perata)+hitungKuadrat(y-perata)+hitungKuadrat(z-perata))/2.00;
        return varians;
    };
    static void tampilData(double dats){
        System.out.println(dats);
    };


    public static void main(String[] args) {
        System.out.print("Masukkan data 1 : ");
        float a = inputData();
        System.out.print("Masukkan data 1 : ");
        float b = inputData();
        System.out.print("Masukkan data 1 : ");
        float c = inputData();
        System.out.println();
        System.out.print("Rata - rata  : ");
        tampilData(hitungRata2(a,b,c));
        System.out.print("Variansi : ");
        tampilData(hitungVariansi(a,b,c));

    }
}
