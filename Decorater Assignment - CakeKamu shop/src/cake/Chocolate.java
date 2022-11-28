 package cake;

public class Chocolate extends CakeDecorator {

    public Chocolate(Cake cake) {
        super(cake);
    }

    @Override
    public String getName() {
        return "Chocolate";
    }

    @Override
    public double getPrice() {
        return 500.00;
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
