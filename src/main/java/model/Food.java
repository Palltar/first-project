package model;


public abstract class Food {

    protected short amount;
    protected float price;
    protected boolean isVegetarian;

    public float getDiscount() {
        return 0;
    }
    public double getTotalPrice() {
        return price * amount;
    }
    public boolean isVegetarian(){return isVegetarian;}


}



