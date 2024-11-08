import java.util.Scanner;

class Commission {
    private double sales; 
    public Commission(double sales) {
        this.sales = sales;
    }
    public double commission() {
        double commissionRate = 0.1; 
        return sales * commissionRate;
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double salesAmount = scanner.nextDouble();
        if (salesAmount >= 0) {
            Commission commissionObj = new Commission(salesAmount);
            double calculatedCommission = commissionObj.commission();
            System.out.println("Commission: $" + calculatedCommission);
        } else {
            System.out.println("Invalid Input: Sales amount cannot be negative.");
        }

        scanner.close();
    }
}

