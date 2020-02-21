package pemlan;

import java.text.SimpleDateFormat;
import java.util.*;

public class utama1{
    public static void main(String[] args) {
        Mobil x_pander = new Mobil();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        x_pander.tglPajak = format.parse("17/02/2020") ;
        x_pander.info();
       
    }
}
