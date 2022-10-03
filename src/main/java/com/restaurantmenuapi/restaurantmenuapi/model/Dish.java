package com.restaurantmenuapi.restaurantmenuapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private Long dish_number;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private float price;
    @Lob
    @Column(nullable = false)
    private String description;

}
