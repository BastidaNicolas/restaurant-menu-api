package com.restaurantmenuapi.restaurantmenuapi.controller;

import com.restaurantmenuapi.restaurantmenuapi.model.Dish;
import com.restaurantmenuapi.restaurantmenuapi.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DishController {

    @Autowired
    private IDishService interDish;

    @GetMapping("/menu")
    public List<Dish> getDishes(){
        return interDish.getDishes();
    }

    @GetMapping("/menu/{id}")
    public Dish getDish(@PathVariable Long id){
        return interDish.getDish(id);
    }

    @PostMapping("/menu/add")
    ResponseEntity<String> addDish(@RequestBody Dish dish){

        List<Dish> dishList = interDish.getDishes();

        for (Dish plate : dishList) {
            if(plate.getDish_number() == dish.getDish_number()){
                return new ResponseEntity<>("Dish number already in use", HttpStatus.CONFLICT);
            }
        }
        interDish.addDish(dish);
        return new ResponseEntity<>("Dish added successfully", HttpStatus.OK);
    }

    @PutMapping("/menu/edit/{id}")
    public Dish editDish(
            @PathVariable Long id,
            @RequestParam ("dish_number") Long newDishNum,
            @RequestParam ("name") String newName,
            @RequestParam ("price") Float newPrice,
            @RequestParam ("description") String newDesc
    ){
        Dish dish = interDish.getDish(id);

        dish.setDish_number(newDishNum);
        dish.setName(newName);
        dish.setPrice(newPrice);
        dish.setDescription(newDesc);

        interDish.addDish(dish);
        return dish;
    }

    @DeleteMapping("/menu/remove/{id}")
    public String removeDish(@PathVariable Long id){
        interDish.removeDish(id);
        return "Dish removed successfully";
    }

}
