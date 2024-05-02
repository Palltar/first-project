package model;

import java.util.Objects;
import static model.constants.Collor.APPLE_RED;
import static model.constants.Discount.*;

public class Apple extends Food  {
    private String colour;
    public Apple(short amount, float price, String colour){
        this.amount=amount;
        this.price=price;
        this.isVegetarian=true;
        this.colour=colour;
    }




    @Override
    public float getDiscount(){
        if(Objects.equals(colour, APPLE_RED)){
            return DISCOUNT_RED_APPLE;
        } else return DISCOUNT_NULL;
    }
}
