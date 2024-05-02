import model.Apple;
import model.Food;
import model.Meat;

import static model.constants.Collor.APPLE_GREEN;
import static model.constants.Collor.APPLE_RED;
import service.ShoppingCart;


import model.constants.Collor;

public class Main {
    public static void main(String[] args) {

        Food[] foods = {
                new Meat((short) 5, 100),
                new Apple((short) 10, 50, APPLE_RED),
                new Apple((short) 8, 60,APPLE_GREEN)
        };

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("сумма товаров без скидки: " + shoppingCart.getTotalPrice() + " руб.");
        System.out.println("сумма товаров со скидкой " + shoppingCart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("cумма всех вегетарианских продуктов без скидки " + shoppingCart.getTotalPriceIsVegetarian() + " руб.");
    }
}