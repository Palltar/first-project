package model;
import static model.constants.Discount.DISCOUNT_NULL ;

public abstract class Food implements Discountable {

    protected short amount;
    protected float price;
    protected boolean isVegetarian;
// кронстанты
    @Override
    public float getDiscount() {
        return DISCOUNT_NULL;
    }
    public double getPrice() {return price;}
    public short getAmount() {return amount;}
    public boolean isVegetarian(){return isVegetarian;}
}



