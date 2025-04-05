package edu.mohamed.restaurantfinder.repository;

import edu.mohamed.restaurantfinder.model.Itinerary;
import edu.mohamed.restaurantfinder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItineraryRepository extends JpaRepository<Itinerary, Long> {
    List<Itinerary> findByUser(User user);
}
