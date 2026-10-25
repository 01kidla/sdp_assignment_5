public class CarDelivery implements DeliveryStrategy {
    private static final double BASE_FEE = 500.0;
    private static final double COST_PER_KM = 350.0;

    @Override
    public double calculateCost(double distanceKm) {
        return BASE_FEE + distanceKm * COST_PER_KM;
    }

    @Override
    public String getStrategyName() {
        return "Car delivery";
    }
}
