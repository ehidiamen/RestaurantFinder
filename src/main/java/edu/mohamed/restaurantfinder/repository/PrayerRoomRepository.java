package edu.mohamed.restaurantfinder.repository;

import edu.mohamed.restaurantfinder.model.PrayerRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrayerRoomRepository extends JpaRepository<PrayerRoom, Long> {
    List<PrayerRoom> findByLocation(String location);
}
