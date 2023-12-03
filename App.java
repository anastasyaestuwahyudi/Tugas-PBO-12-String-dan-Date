import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket("ESTU MART");
        Customer customer = new Customer();
        Purchase purchase = new Purchase();
        Cashier kasir = new Cashier();

        Scanner scanner = new Scanner(System.in);

        customer.inputCustomerDetails(scanner);
        purchase.inputPurchaseDetails(scanner);

        System.out.println(" ");
        System.out.println(supermarket.getName());
        System.out.println("-----------------------");
        System.out.println("Tanggal        :" + supermarket.getFormattedDate());
        System.out.println("Waktu          :" + supermarket.getFormattedTime());
        System.out.println("-----------------------");
        System.out.println(customer.getCustomerInfo());
        System.out.println("+++++++++++++++++++++++");
        System.out.println(purchase.getPurchaseInfo());
        System.out.println("Kasir          :");
        kasir.inputCashierDetails(scanner);
        System.out.println(kasir.getCashierInfo());
    }

    public void inputPurchaseDetails(Scanner scanner) {
        try {
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
