package icecream;

public abstract class IceCreamDecorator implements IceCream {
    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getFlavour() {
        return iceCream.getFlavour();
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public double calculatePrice() {
        return iceCream.getPrice();
    }
}
