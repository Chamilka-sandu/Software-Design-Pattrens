package icecream;

public class Strawberry extends IceCreamDecorator {

    public Strawberry(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getFlavour() {
        return "Strawberry";
    }

    @Override
    public double getPrice() {
        return 30.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + " +  getFlavour() + ": (" + (int) getPrice() + "rs)";
    }

    @Override
    public double calculatePrice() {
        return iceCream.calculatePrice() + getPrice();
    }
}
