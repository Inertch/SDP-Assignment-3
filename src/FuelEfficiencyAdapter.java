public class FuelEfficiencyAdapter implements MetricFuelEfficiency {
    private final ImperialFuelStats imperialStats;

    public FuelEfficiencyAdapter(ImperialFuelStats imperialStats) {
        this.imperialStats = imperialStats;
    }

    @Override
    public double getLitersPer100Km(double mpg) {
        return 235.214583 / mpg;
    }

    public double convertFromImperial(double distanceMiles, double fuelGallons) {
        double mpg = imperialStats.getMilesPerGallon(distanceMiles, fuelGallons);
        return getLitersPer100Km(mpg);
    }
}

