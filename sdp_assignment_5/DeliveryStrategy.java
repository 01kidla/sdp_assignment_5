public interface DeliveryStrategy {
    double calculateCost(double distanceKm);
    String getStrategyName();
}
