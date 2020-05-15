public class Invoice implements Payable {
    String productName;
    int quantity;
    int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public int getPayableMethod() {
        return quantity*pricePerItem;
    }    

    @Override
    public String toString() {
        System.out.println("Nama Barang : " + productName);
        System.out.println("Jumlah : " + quantity);
        System.out.println("Harga Per Barang : Rp." + pricePerItem);
        System.out.println("Total harga barang : Rp." + getPayableMethod());
        return "";
    }
}