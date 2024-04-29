import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {

        Food[] foods = {
                new Meat((short) 5, 100),
                new Apple((short) 10, 50,"Red"),
                new Apple((short) 8, 60,"green")
        };

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalPrice() + " руб.");
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getTotalPriceIsVegetarian() + " руб.");
    }
}