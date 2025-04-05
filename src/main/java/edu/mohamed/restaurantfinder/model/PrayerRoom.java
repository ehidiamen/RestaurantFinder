package edu.mohamed.restaurantfinder.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prayer_rooms")
public class PrayerRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String facilities;

    // Default constructor
    public PrayerRoom() {
    }

    // Parameterized constructor
    public PrayerRoom(String name, String location, String facilities) {
        this.name = name;
        this.location = location;
        this.facilities = facilities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the location of the prayer room.
     * 
     * @return the location as a String.
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return "PrayerRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", facilities='" + facilities + '\'' +
                '}';
    }
}
