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
            totalPrice = totalPrice + food.getTotalPrice();
        }
        return totalPrice;
    }

    //Тут стандартная ошибка на деление foat, всё переделать под  BigDecimal.
    public double getTotalPriceWithDiscount() {
        double totalPriceWithDiscount = 0;
        for (Food food : elements) {
            totalPriceWithDiscount = totalPriceWithDiscount + food.getTotalPrice()
                    -food.getTotalPrice()*food.getDiscount()/100;
        }
        return totalPriceWithDiscount;
    }

    public double getTotalPriceIsVegetarian() {
        double totalPriceIsVegetarian = 0;
        for (Food food : elements) {
            if(food.isVegetarian()){
                if (food.getDiscount()==0){totalPriceIsVegetarian = totalPriceIsVegetarian + food.getTotalPrice();}
            }

        }
        return totalPriceIsVegetarian;
    }
}
