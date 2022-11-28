package cake;

public class ButterCake implements Cake {

    @Override
    public String getName() {
        return "Butter Cake";
    }

    @Override
    public double getPrice() {
        return 500.00;
    }

    @Override
    public String getDescription() {
        return getName() + ": (" + (int) getPrice() + " rs/kg)";
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
