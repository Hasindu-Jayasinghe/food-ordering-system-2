package lk.nsbm.onlinefoodorderingsystem.dto;

import lk.nsbm.onlinefoodorderingsystem.entity.Food;

import java.util.List;

public class RestaurantDto {
    private int restaurantId;
    private String restaurantName;
    private String location;
    private List<Food> foodList;

    public RestaurantDto() {
    }

    public RestaurantDto(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public RestaurantDto(int restaurantId, String restaurantName, String location) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.location = location;
    }

    public RestaurantDto(int restaurantId, String restaurantName, String location, List<Food> foodList) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.location = location;
        this.foodList = foodList;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
