import cake.ButterCake;
import cake.Cake;
import cake.Coffee;
import cake.Nut;
import icecream.IceCream;
import icecream.PlainIceCream;
import icecream.Strawberry;


public class Cakeshop {

    public static void main(String[] args) {
     
        IceCream strawberryIceCream = new Strawberry(new PlainIceCream());
        Cake coffeeNutCake = new Nut(new Coffee(new ButterCake()));

        System.out.println("\nYour Total Bill is:");

        System.out.println(strawberryIceCream.getDescription() + " = " + strawberryIceCream.calculatePrice());

        System.out.println(coffeeNutCake.getDescription() + " = " + coffeeNutCake.calculatePrice());

        System.out.println("\nTotal: " + (strawberryIceCream.calculatePrice() + coffeeNutCake.calculatePrice()));
    }

    
    
}
