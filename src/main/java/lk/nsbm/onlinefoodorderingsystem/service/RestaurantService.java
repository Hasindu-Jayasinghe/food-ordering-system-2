package lk.nsbm.onlinefoodorderingsystem.service;

import lk.nsbm.onlinefoodorderingsystem.dto.FoodDto;
import lk.nsbm.onlinefoodorderingsystem.dto.RestaurantDto;
import lk.nsbm.onlinefoodorderingsystem.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    public boolean addRestaurant(RestaurantDto restaurantDto);
    public RestaurantDto getFoodDtoList(int restaurantId);
    public List<RestaurantDto> getRestaurantList();
}
