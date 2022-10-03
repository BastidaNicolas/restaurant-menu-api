package com.restaurantmenuapi.restaurantmenuapi.repository;

import com.restaurantmenuapi.restaurantmenuapi.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
}
