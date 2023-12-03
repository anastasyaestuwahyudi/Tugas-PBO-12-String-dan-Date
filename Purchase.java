import java.util.Scanner;

public class Purchase {
    private String invoiceNumber;
    private String productCode;
    private String productName;
    private double productPrice;
    private int quantity;

    public void inputPurchaseDetails(Scanner scanner) {
        System.out.print("Nomor Faktur         : ");
        this.invoiceNumber = scanner.nextLine();
        System.out.print("Kode Barang          : ");
        this.productCode = scanner.nextLine();
        System.out.print("Nama Barang          : ");
        this.productName = scanner.nextLine();
        System.out.print("Harga Barang         : Rp.");
        this.productPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Jumlah Beli          : ");
        this.quantity = Integer.parseInt(scanner.nextLine());
    }

    public double calculateTotalPayment() {
        return productPrice * quantity;
    }

    public String getPurchaseInfo() {
        return "Nomor Faktur         : " + invoiceNumber + "\nKode Barang          : " + productCode
                + "\nNama Barang          : " + productName +
                "\nHarga Barang         : Rp." + productPrice + "\nJumlah Beli          : " + quantity +
                "\nTOTAL BAYAR          : Rp." + String.format("%.2f", calculateTotalPayment())
                + "\n+++++++++++++++++++++++";
    }
}
