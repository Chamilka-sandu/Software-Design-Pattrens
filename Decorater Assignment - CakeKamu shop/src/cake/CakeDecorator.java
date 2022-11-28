package cake;

public abstract class CakeDecorator implements Cake {
    protected Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getName() {
        return cake.getName();
    }

    @Override
    public double getPrice() {
        return cake.getPrice();
    }

    @Override
    public String getDescription() {
        return cake.getDescription();
    }

    @Override
    public double calculatePrice() {
        return cake.getPrice();
    }
}
