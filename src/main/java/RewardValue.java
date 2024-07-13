import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.0035; // Example rate: 1 mile = $0.0035

    public RewardValue(double cashValue, double milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    public double getCashValueFromMiles() {
        return milesValue * CONVERSION_RATE;
    }

    public double getMilesValueFromCash() {
        return cashValue / CONVERSION_RATE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cash amount:");
        double cashValue = sc.nextDouble();

        System.out.println("Enter the miles value:");
        double milesValue = sc.nextDouble();

        RewardValue rewardValue = new RewardValue(cashValue, milesValue);

        System.out.println("Miles value from cash: " + rewardValue.getMilesValueFromCash());
        System.out.println("Cash value from miles: " + rewardValue.getCashValueFromMiles());
    }
}
