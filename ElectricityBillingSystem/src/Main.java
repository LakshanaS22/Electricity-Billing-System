import java.util.Scanner;
import model.Bill;
import service.AdminService;
import service.BillingService;

public class Main {
    public static void main(String[] args) {
        AdminService adminService = new AdminService();
        BillingService billingService = new BillingService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Electricity Billing System ===");
        System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        if (adminService.login(username, password)) {
            System.out.println("Login Successful!");

            while (true) {
                System.out.println("\n1. Add Bill");
                System.out.println("2. View Bills");
                System.out.println("3. Pay Bill");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Customer Name: ");
                        scanner.nextLine(); // Consume newline
                        String name = scanner.nextLine();
                        System.out.print("Enter Customer Address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter Units Consumed: ");
                        int units = scanner.nextInt();
                        double amount = units * 5.0; // Assume cost per unit = 5.0

                        Bill bill = new Bill();
                        bill.setCustomerName(name);
                        bill.setCustomerAddress(address);
                        bill.setUnits(units);
                        bill.setAmount(amount);
                        bill.setStatus("UNPAID");

                        if (billingService.addBill(bill)) {
                            System.out.println("Bill added successfully!");
                        } else {
                            System.out.println("Failed to add bill.");
                        }
                    }
                    case 2 -> billingService.viewBills();
                    case 3 -> {
                        System.out.print("Enter Bill ID to Pay: ");
                        int billId = scanner.nextInt();
                        if (billingService.payBill(billId)) {
                            System.out.println("Bill paid successfully!");
                        } else {
                            System.out.println("Failed to pay bill or already paid.");
                        }
                    }
                    case 4 -> {
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            }
        } else {
            System.out.println("Invalid login! Exiting...");
        }
    }
}
