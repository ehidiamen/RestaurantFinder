package edu.mohamed.restaurantfinder.repository;

import edu.mohamed.restaurantfinder.model.HalalRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HalalRestaurantRepository extends JpaRepository<HalalRestaurant, Long> {
    List<HalalRestaurant> findByCity(String city);
    List<HalalRestaurant> findByCuisineType(String cuisineType);
}

