package lk.nsbm.onlinefoodorderingsystem.service.impl;

import lk.nsbm.onlinefoodorderingsystem.dto.FoodDto;
import lk.nsbm.onlinefoodorderingsystem.dto.RestaurantDto;
import lk.nsbm.onlinefoodorderingsystem.entity.Food;
import lk.nsbm.onlinefoodorderingsystem.entity.FoodTitle;
import lk.nsbm.onlinefoodorderingsystem.entity.Restaurant;
import lk.nsbm.onlinefoodorderingsystem.repository.RestaurantRepository;
import lk.nsbm.onlinefoodorderingsystem.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant saveRestaurant(Restaurant restaurant) {
        if (restaurant == null){
            return null;
        }

        return restaurantRepository.save(restaurant);
    }


    @Override
    public boolean addRestaurant(RestaurantDto restaurantDto) {

        if (restaurantDto == null){
            return false;
        }

        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantId(restaurantDto.getRestaurantId());
        restaurant.setRestaurantName(restaurantDto.getRestaurantName());
        restaurant.setLocation(restaurantDto.getLocation());

        if (restaurantRepository.existsById(restaurantDto.getRestaurantId())){
            return false;
        }

        try {
            restaurantRepository.save(restaurant);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public RestaurantDto getFoodDtoList(int restaurantId) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId).get();

        RestaurantDto restaurantDto = new RestaurantDto();

        restaurantDto.setRestaurantName(restaurant.getRestaurantName());
        restaurantDto.setFoodList(
                restaurant.getFoodList().stream().map(food ->
                {
                    FoodTitle foodTitle = new FoodTitle();
                    foodTitle.setName(food.getFoodTitle().getName());
                    foodTitle.setTitleId(food.getFoodTitle().getTitleId());
                    return new Food(food.getFoodId(),food.getFoodName(),food.getPrice(), foodTitle);

                }).collect(Collectors.toList()));

        return restaurantDto;
    }

    @Override
    public List<RestaurantDto> getRestaurantList() {
        List<RestaurantDto> restaurantDtoList = restaurantRepository.findAll().stream().map(restaurant ->
                new RestaurantDto(
                        restaurant.getRestaurantId(),
                        restaurant.getRestaurantName(),
                        restaurant.getLocation())).collect(Collectors.toList());



        return restaurantDtoList;
    }
}
