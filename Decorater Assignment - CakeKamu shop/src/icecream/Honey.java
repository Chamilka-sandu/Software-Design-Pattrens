package icecream;

public class Honey extends IceCreamDecorator {

    public Honey(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getFlavour() {
        return "Honey";
    }

    @Override
    public double getPrice() {
        return 20.00;
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
