public class DeliveryContext {
    private DeliveryStrategy strategy;

    public DeliveryContext(DeliveryStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(DeliveryStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Delivery strategy cannot be null.");
        }
        this.strategy = strategy;
    }

    public double calculateDeliveryCost(double distanceKm) {
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("Distance must be greater than zero.");
        }
        return strategy.calculateCost(distanceKm);
    }

    public String getStrategyName() {
        return strategy.getStrategyName();
    }
}
