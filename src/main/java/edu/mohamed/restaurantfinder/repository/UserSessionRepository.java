package edu.mohamed.restaurantfinder.repository;


import edu.mohamed.restaurantfinder.model.UserSession;
import edu.mohamed.restaurantfinder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserSessionRepository extends JpaRepository<UserSession, String> {
    Optional<UserSession> findBySessionToken(String sessionToken);
    void deleteByUser(User user);
}

