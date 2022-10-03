package com.restaurantmenuapi.restaurantmenuapi.service;

import com.restaurantmenuapi.restaurantmenuapi.model.Dish;

import java.util.List;

public interface IDishService {
    List<Dish> getDishes();

    Dish getDish(Long id);

    void addDish(Dish dish);

    void removeDish(Long id);
}
