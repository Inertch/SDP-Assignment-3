public class FuelConverter {
    public static void main(String[] args) {
        ImperialFuelStats imperialStats = new ImperialFuelStats();
        FuelEfficiencyAdapter adapter = new FuelEfficiencyAdapter(imperialStats);

        double distanceMiles = 340;
        double fuelGallons = 16;

        System.out.printf("Fuel Consumption: %.2f L/100km%n", adapter.convertFromImperial(distanceMiles, fuelGallons));
    }
}
