package lk.nsbm.onlinefoodorderingsystem.controller;

import lk.nsbm.onlinefoodorderingsystem.dto.FoodTitleDto;
import lk.nsbm.onlinefoodorderingsystem.service.FoodTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/foods-title")
public class FoodTitleController {

    @Autowired
    private FoodTitleService foodTitleService;

    @GetMapping
    public List<FoodTitleDto> getFoodTitleList(){
        return foodTitleService.getAllFoodTitles();
    }
}
