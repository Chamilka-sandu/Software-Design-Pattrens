package icecream;

public class Butterscotch extends IceCreamDecorator {

    public Butterscotch(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getFlavour() {
        return "Butterscotch";
    }

    @Override
    public double getPrice() {
        return 40.00;
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
