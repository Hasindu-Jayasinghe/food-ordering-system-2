package lk.nsbm.onlinefoodorderingsystem.dto;

import java.util.List;

public class FoodDto {
    private int foodId;
    private String foodName;
    private double price;
    private FoodTitleDto foodTitle;
    private List<RestaurantDto> restaurantDtoList;

    public FoodDto() {
    }

    public FoodDto(int foodId, String foodName, double price, FoodTitleDto foodTitle, List<RestaurantDto> restaurantDtoList) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.foodTitle = foodTitle;
        this.restaurantDtoList = restaurantDtoList;
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

    public List<RestaurantDto> getRestaurantDtoList() {
        return restaurantDtoList;
    }

    public void setRestaurantDtoList(List<RestaurantDto> restaurantDtoList) {
        this.restaurantDtoList = restaurantDtoList;
    }

    public FoodTitleDto getFoodTitle() {
        return foodTitle;
    }

    public void setFoodTitle(FoodTitleDto foodTitle) {
        this.foodTitle = foodTitle;
    }
}
