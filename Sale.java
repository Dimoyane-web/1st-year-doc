import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter number of packets sold: ");
        int numberOfPackets = input.nextInt();

        System.out.print("Enter price per packet: ");
        double pricePerPacket = input.nextDouble();

        System.out.print("Enter cost per packet: ");
        double costPerPacket = input.nextDouble();

        // Calculations
        double totalSales = numberOfPackets * pricePerPacket;
        double packagingCost = totalSales * 0.05;
        double totalProductionCost = numberOfPackets * costPerPacket;
        double profit = totalSales - (packagingCost + totalProductionCost);

        // Output
        System.out.println("Total sales: " + totalSales);
        System.out.println("Packaging cost: " + packagingCost);
        System.out.println("Total production cost: " + totalProductionCost);
        System.out.println("Profit: " + profit);

        input.close();
    }
}
