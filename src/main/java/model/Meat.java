package model;

//  Напитсать бы првоерку наличия DISCOUNT_MEAT в каласе Discont. А не просто выкуидывать 0
public class Meat  extends Food implements Discountable  {
    public Meat(short amount, float price){
        this.amount=amount;
        this.price=price;
        isVegetarian=false;
    }


}
