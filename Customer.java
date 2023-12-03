import java.util.Scanner;

public class Customer {
    private String name;
    private String phoneNumber;
    private String address;

    public void inputCustomerDetails(Scanner scanner) {
        System.out.print("Nama Pelanggan       : ");
        this.name = scanner.nextLine();
        System.out.print("No. HP               : ");
        this.phoneNumber = scanner.nextLine();
        System.out.print("Alamat               : ");
        this.address = scanner.nextLine();
    }

    public String getCustomerInfo() {
        return "Nama Pelanggan         : " + name +
                "\nNo. HP                 : " + phoneNumber +
                "\nAlamat                 : " + address;
    }
}
