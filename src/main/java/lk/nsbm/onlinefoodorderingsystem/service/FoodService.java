package lk.nsbm.onlinefoodorderingsystem.service;

import lk.nsbm.onlinefoodorderingsystem.dto.FoodDto;
import lk.nsbm.onlinefoodorderingsystem.entity.Food;

import java.util.List;

public interface FoodService {
    public Food saveFood(FoodDto food);
    public List<FoodDto> getAllFoods();
}
