package icecream;

public class PlainIceCream implements IceCream {

    @Override
    public String getFlavour() {
        return "Ice Cream";
    }

    @Override
    public double getPrice() {
        return 20.00;
    }

    @Override
    public String getDescription() {
        return getFlavour() + ": (" + (int) getPrice() + "rs)";
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
