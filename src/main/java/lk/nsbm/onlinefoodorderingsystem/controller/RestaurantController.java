package lk.nsbm.onlinefoodorderingsystem.controller;

import lk.nsbm.onlinefoodorderingsystem.dto.FoodDto;
import lk.nsbm.onlinefoodorderingsystem.dto.RestaurantDto;
import lk.nsbm.onlinefoodorderingsystem.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/restaurants")
public class RestaurantController {


    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/add")
    public boolean addRestaurant(@RequestBody RestaurantDto restaurantDto){
        return restaurantService.addRestaurant(restaurantDto);
    }

    @GetMapping("/{id}")
    public RestaurantDto getFoodDtoList(@PathVariable int id){
        return restaurantService.getFoodDtoList(id);
    }

    @GetMapping
    public List<RestaurantDto> getAllRestaurants(){
        return restaurantService.getRestaurantList();
    }

}
