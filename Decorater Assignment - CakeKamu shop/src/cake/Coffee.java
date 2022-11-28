package cake;

public class Coffee extends CakeDecorator {

    public Coffee(Cake cake) {
        super(cake);
    }

    @Override
    public String getName() {
        return "Coffee";
    }

    @Override
    public double getPrice() {
        return 700.00;
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
