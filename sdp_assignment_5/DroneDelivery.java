public class DroneDelivery implements DeliveryStrategy {
    private static final double BASE_FEE = 1000.0;
    private static final double COST_PER_KM = 150.0;

    @Override
    public double calculateCost(double distanceKm) {
        return BASE_FEE + distanceKm * COST_PER_KM;
    }

    @Override
    public String getStrategyName() {
        return "Drone delivery";
    }
}
