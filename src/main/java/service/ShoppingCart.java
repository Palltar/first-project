package service;
import model.Food;




public class ShoppingCart {

    private Food[] elements;

    public ShoppingCart(Food[] elements) {
        this.elements=elements;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Food food : elements) {
            totalPrice = totalPrice + food.getPrice()* food.getAmount();
        }
        return totalPrice;
    }


    public double getTotalPriceWithDiscount() {
        double totalPriceWithDiscount = 0;
        for (Food food : elements) {
            totalPriceWithDiscount = totalPriceWithDiscount + food.getPrice()* food.getAmount()
                    -food.getPrice()* food.getAmount()*food.getDiscount()/100;
        }
        return totalPriceWithDiscount;
    }

    public double getTotalPriceIsVegetarian() {
        double totalPriceIsVegetarian = 0;
        for (Food food : elements) {
            if(food.isVegetarian()){
                totalPriceIsVegetarian = totalPriceIsVegetarian + food.getPrice()* food.getAmount();
            }

        }
        return totalPriceIsVegetarian;
    }
}
