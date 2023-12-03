import java.util.Scanner;

public class Cashier extends Employee {
    @Override
    public void work() {
        System.out.println("Kasir       : ");
    }

    private String firstName;
    private String lastName;

    public void inputCashierDetails(Scanner scanner) {
        System.out.print("First Name          : ");
        this.firstName = scanner.nextLine();
        System.out.print("Last Name           : ");
        this.lastName = scanner.nextLine();
    }

    public String getCashierInfo() {
        String fullName = firstName + " " + lastName;
        return "\n" + "First Name          : " + firstName +
                "\nLast Name           : " + lastName
                + "\nFull Name           : " + fullName +
                "\nUppercase           : " + fullName.toUpperCase() +
                "\nLowercase           : "
                + fullName.toLowerCase();
    }
}
