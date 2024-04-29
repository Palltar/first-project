package model;

import java.util.Objects;
import static model.constants.Collor.*;
import static model.constants.Discount.*;

public class Apple extends Food implements Discountable {
    private String colour;
    public Apple(short amount, float price, String colour){
        this.amount=amount;
        this.price=price;
        this.isVegetarian=true;
        this.colour=colour;
    }
    //для красных яблок (colour равно "red")
    // скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
    // Заменил == на Objects.equals.....?
    @Override
    public float getDiscount(){
        if(Objects.equals(colour, APPLE_RED)){
            return DISCOUNT_RED_APPLE;
        } else return DISCOUNT_NULL;
    }
}
