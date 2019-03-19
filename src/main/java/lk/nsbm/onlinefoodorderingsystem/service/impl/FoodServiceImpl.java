package lk.nsbm.onlinefoodorderingsystem.service.impl;

import lk.nsbm.onlinefoodorderingsystem.dto.FoodDto;
import lk.nsbm.onlinefoodorderingsystem.dto.FoodTitleDto;
import lk.nsbm.onlinefoodorderingsystem.dto.RestaurantDto;
import lk.nsbm.onlinefoodorderingsystem.entity.Food;
import lk.nsbm.onlinefoodorderingsystem.repository.FoodRepository;
import lk.nsbm.onlinefoodorderingsystem.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food saveFood(Food food) {
        if (food == null) {
            return null;
        }
        return foodRepository.save(food);
    }

    @Override
    public Food saveFood(FoodDto food) {
        return null;
    }

    @Override
    public List<FoodDto> getAllFoods() {
        List<FoodDto> foodDtoList = foodRepository.findAll().stream().map(
                food -> new FoodDto(food.getFoodId(), food.getFoodName(), food.getPrice(),
                        new FoodTitleDto(food.getFoodTitle().getTitleId(), food.getFoodTitle().getName()),
                        food.getRestaurantList().stream().map(restaurant -> new RestaurantDto(restaurant.getRestaurantName()))
                                .collect(Collectors.toList()))).collect(Collectors.toList());
        return foodDtoList;
    }
}
