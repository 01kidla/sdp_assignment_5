public class BikeDelivery implements DeliveryStrategy {
    private static final double COST_PER_KM = 200.0;

    @Override
    public double calculateCost(double distanceKm) {
        return distanceKm * COST_PER_KM;
    }

    @Override
    public String getStrategyName() {
        return "Bike delivery";
    }
}
