package com.restaurantmenuapi.restaurantmenuapi.service;

import com.restaurantmenuapi.restaurantmenuapi.model.Dish;
import com.restaurantmenuapi.restaurantmenuapi.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService implements IDishService {

    @Autowired
    private DishRepository dishRepository;


    @Override
    public List<Dish> getDishes() {
        List<Dish> menu = dishRepository.findAll();
        return menu;
    }

    @Override
    public Dish getDish(Long id) {
        Dish dish = dishRepository.findById(id).orElse(null);
        return dish;
    }

    @Override
    public void addDish(Dish dish) {
        dishRepository.save(dish);
    }

    @Override
    public void removeDish(Long id) {
        dishRepository.deleteById(id);
    }
}
