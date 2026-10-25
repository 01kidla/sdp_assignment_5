import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, DeliveryStrategy> strategies = Map.of(
                1, new BikeDelivery(),
                2, new CarDelivery(),
                3, new DroneDelivery()
        );

        System.out.println("=== Food Delivery Cost Calculator ===");
        System.out.println("1. Bicycle");
        System.out.println("2. Car");
        System.out.println("3. Drone");
        System.out.print("Choose delivery method: ");

        int choice = scanner.nextInt();
        DeliveryStrategy selectedStrategy = strategies.get(choice);

        if (selectedStrategy == null) {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        DeliveryContext delivery = new DeliveryContext(selectedStrategy);

        System.out.print("Enter distance in kilometers: ");
        double distanceKm = scanner.nextDouble();

        try {
            System.out.println("Method: " + delivery.getStrategyName());
            System.out.printf("Cost: %.2f KZT%n",
                    delivery.calculateDeliveryCost(distanceKm));

            System.out.println("\nSwitching strategy at runtime to car delivery...");
            delivery.setStrategy(new CarDelivery());
            System.out.println("Method: " + delivery.getStrategyName());
            System.out.printf("New cost: %.2f KZT%n",
                    delivery.calculateDeliveryCost(distanceKm));
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        scanner.close();
    }
}
