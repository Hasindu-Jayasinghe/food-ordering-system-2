package lk.nsbm.onlinefoodorderingsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Food {
    @Id
    private int foodId;
    private String foodName;
    private double price;
    @ManyToOne
    private FoodTitle foodTitle;
    @OneToMany
    private List<Restaurant> restaurantList;

    public Food() {
    }

    public Food(int foodId, String foodName, double price, FoodTitle foodTitle) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.foodTitle = foodTitle;
    }

    public Food(int foodId, String foodName, double price, FoodTitle foodTitle, List<Restaurant> restaurantList) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.foodTitle = foodTitle;
        this.restaurantList = restaurantList;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public FoodTitle getFoodTitle() {
        return foodTitle;
    }

    public void setFoodTitle(FoodTitle foodTitle) {
        this.foodTitle = foodTitle;
    }
}
