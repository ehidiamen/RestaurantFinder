package edu.mohamed.restaurantfinder.repository;

import edu.mohamed.restaurantfinder.model.ItineraryDetail;
import edu.mohamed.restaurantfinder.model.Itinerary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItineraryDetailRepository extends JpaRepository<ItineraryDetail, Long> {
    List<ItineraryDetail> findByItinerary(Itinerary itinerary);
}
