package cake;

public class Nut extends CakeDecorator {

    public Nut(Cake cake) {
        super(cake);
    }

    @Override
    public String getName() {
        return "Nut";
    }

    @Override
    public double getPrice() {
        return 300.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + " +  getName() + ": (" + (int) getPrice() + " rs/kg)";
    }

    @Override
    public double calculatePrice() {
        return cake.calculatePrice() + getPrice();
    }
}
