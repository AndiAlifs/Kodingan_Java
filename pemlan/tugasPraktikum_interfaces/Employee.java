
public class Employee implements Payable {
    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new Invoice[invoices.length];
        this.invoices = invoices;
    }

    @Override
    public int getPayableMethod() {
        int temp = 0;
        for (int i=0;i<invoices.length;i++){
            temp = temp + invoices[i].getPayableMethod();
        }
        temp = salaryPerMonth - temp;
        return temp;
    }

    @Override
    public String toString() {
        System.out.println("Nama Karyawan : " + name);
        System.out.println("Registrasion Number Karyawan : " + registrationNumber );
        System.out.println("Gaji Per Bulan = Rp." + salaryPerMonth);
        System.out.println("");

        System.out.println("=====DAFTAR BELANJAAN=====");
        int temp = 0;
        for (int i=0;i<invoices.length;i++){
            System.out.println(invoices[i]);
            temp += invoices[i].getPayableMethod();
        }
        System.out.println("Total belanjaan : Rp."+temp);
        System.out.println("==========================");
        System.out.println("");
        System.out.println("Gaji bersih bulan ini = Rp." + getPayableMethod());
        return "";
    }
}